package com.invoicefair.server.api.rest.v1;

import com.invoicefair.server.api.rest.v1.vo.responses.BalanceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(AbstractApiV1Resource.path + "/balances")
public class BalanceResource extends AbstractApiV1Resource{

    @GetMapping("/:mail")
    public ResponseEntity<BalanceResponse> findOne(@RequestParam("mail") String mail) {
        return ResponseEntity.ok(new BalanceResponse());
    }
}
