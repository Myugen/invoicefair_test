package com.invoicefair.server.api.rest.v1;

import com.invoicefair.server.api.rest.v1.vo.responses.AccountResponse;
import com.invoicefair.server.domain.Account;
import com.invoicefair.server.services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(AccountResource.PATH)
@AllArgsConstructor
public class AccountResource extends AbstractApiV1Resource {
    public static final String PATH = BASE_API_V1_PATH + "/accounts";

    private final AccountService accountService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public ResponseEntity<List<AccountResponse>> findOne() {
        List<Account> accounts = accountService.findAll();
        List<AccountResponse> responses = accounts.stream().map(AccountResponse::fromDomain).collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }
}
