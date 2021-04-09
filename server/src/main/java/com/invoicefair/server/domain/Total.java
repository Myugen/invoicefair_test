package com.invoicefair.server.domain;

import com.invoicefair.server.entities.AccountEntity;
import com.invoicefair.server.entities.TotalEntity;
import com.invoicefair.server.enums.Currency;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;
import java.util.Map;

@Value
@RequiredArgsConstructor
public class Total {

    public static Total fromEntity(TotalEntity entity) {
        TotalId id = new TotalId(entity.getId());
        return new Total(id, entity.getBalance(), entity.getCurrency().getCurrency(), entity.getCurrency().getConversors());
    }

    @Getter TotalId id;
    @Getter BigDecimal balance;
    @Getter Currency currency;
    @Getter Map<Currency, BigDecimal> conversors;

    public BigDecimal to(Currency currency) {
        return conversors.get(currency);
    }

    @Value
    public static class TotalId {
        Long value;
    }
}
