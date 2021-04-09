package com.invoicefair.server.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Balance {
    @Getter private final Account account;
    @Getter private final List<Total> totals;

    public static Balance create(Account account, Total ...totals) {
        return new Balance(account, Arrays.asList(totals));
    }
}
