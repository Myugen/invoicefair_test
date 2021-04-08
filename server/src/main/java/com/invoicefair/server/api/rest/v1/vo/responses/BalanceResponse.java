package com.invoicefair.server.api.rest.v1.vo.responses;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BalanceResponse {
    private List<Total> totals;
    private Account account;

    @Getter
    @Setter
    private static class Total {
        private enum Currency {
            EUR(BigDecimal.ONE), USD(BigDecimal.valueOf(0.89));

            private final BigDecimal toEurRate;

            Currency(BigDecimal rate) {
                this.toEurRate = rate;
            }

            public BigDecimal getToEurRate() {
                return toEurRate;
            }
        }

        private Currency currency;
        private BigDecimal balance;
        private BigDecimal toEurRate;

        private Total(Currency currency, BigDecimal balance) {
            this.currency = currency;
            this.balance = balance;
            this.toEurRate = currency.getToEurRate();
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    private static class Account {
        private String reference;
        private String displayName;
    }
}
