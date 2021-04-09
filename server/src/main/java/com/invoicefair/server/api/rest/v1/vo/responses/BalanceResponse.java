package com.invoicefair.server.api.rest.v1.vo.responses;

import com.invoicefair.server.domain.Account;
import com.invoicefair.server.domain.Balance;
import com.invoicefair.server.domain.Total;
import com.invoicefair.server.enums.Currency;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BalanceResponse {
    private AccountResponse account;
    private List<TotalResponse> totals;

    public static BalanceResponse fromDomain(Balance balance) {
        AccountResponse account = AccountResponse.fromDomain(balance.getAccount());
        List<TotalResponse> totals = balance.getTotals().stream().map(TotalResponse::fromDomain).collect(Collectors.toList());

        return new BalanceResponse(account, totals);
    }

    @Getter
    @Setter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    private static class TotalResponse {

        private Currency currency;
        private BigDecimal balance;
        private BigDecimal toEurRate;

        private static TotalResponse fromDomain(Total total) {
            BigDecimal toEurRate = total.to(Currency.EUR);
            return new TotalResponse(total.getCurrency(), total.getBalance(), toEurRate);
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    private static class AccountResponse {
        private String reference;
        private String displayName;

        private static AccountResponse fromDomain(Account account) {
            String reference = account.getReference();
            String displayName = String.format("%s %s", account.getName(), account.getLastName());
            return new AccountResponse(reference, displayName);
        }
    }
}
