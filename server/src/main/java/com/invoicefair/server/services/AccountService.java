package com.invoicefair.server.services;

import com.invoicefair.server.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
}
