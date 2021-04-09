package com.invoicefair.server.services.impl;

import com.invoicefair.server.domain.Account;
import com.invoicefair.server.domain.Balance;
import com.invoicefair.server.domain.Total;
import com.invoicefair.server.entities.AccountEntity;
import com.invoicefair.server.entities.TotalEntity;
import com.invoicefair.server.repositories.AccountRepository;
import com.invoicefair.server.repositories.TotalRepository;
import com.invoicefair.server.services.AccountService;
import com.invoicefair.server.services.BalanceService;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        List<AccountEntity> accountEntities = accountRepository.findAll();
        return accountEntities.stream().map(Account::fromEntity).collect(Collectors.toList());
    }
}
