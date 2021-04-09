package com.invoicefair.server.api.rest.v1.vo.responses;

import com.invoicefair.server.domain.Account;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountResponse {
    private final String username;
    private final String displayName;

    public static AccountResponse fromDomain(Account account) {
        String displayName = String.format("%s %s", account.getName(), account.getLastName());
        return new AccountResponse(account.getUsername(), displayName);
    }
}
