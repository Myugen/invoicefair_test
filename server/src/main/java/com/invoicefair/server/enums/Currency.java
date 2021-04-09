package com.invoicefair.server.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Currency {
    EUR("Euro"), GBP("Pound sterling"), USD("United States dollar");

    @Getter private final String officialName;
}
