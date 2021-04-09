package com.invoicefair.server.api.rest.v1;

import com.invoicefair.server.api.rest.v1.vo.responses.BalanceResponse;
import com.invoicefair.server.domain.Balance;
import com.invoicefair.server.services.BalanceService;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BalanceResource.PATH)
@AllArgsConstructor
public class BalanceResource extends AbstractApiV1Resource {

    public static final String PATH = BASE_API_V1_PATH + "/balances";

    public final BalanceService balanceService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{username}")
    public ResponseEntity<BalanceResponse> findOne(@PathVariable("username") String username) {
        BalanceResponse response;
        try {
            Balance balance = balanceService.findOne(username);
            response = BalanceResponse.fromDomain(balance);
        } catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(response);
    }
}
