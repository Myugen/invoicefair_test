package com.invoicefair.server.domain;

import com.invoicefair.server.entities.AccountEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class Account {

    public static Account fromEntity(AccountEntity entity) {
        AccountId id = new AccountId(entity.getId());
        return new Account(id, entity.getUsername(), entity.getReference(), entity.getName(), entity.getLastName());
    }

    @Getter AccountId id;
    @Getter String username;
    @Getter String reference;
    @Getter String name;
    @Getter String lastName;

    @Value
    public static class AccountId {
        Long value;
    }
}
