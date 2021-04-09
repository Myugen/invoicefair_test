package com.invoicefair.server.services.impl;

import com.invoicefair.server.domain.Account;
import com.invoicefair.server.domain.Balance;
import com.invoicefair.server.domain.Total;
import com.invoicefair.server.entities.AccountEntity;
import com.invoicefair.server.entities.TotalEntity;
import com.invoicefair.server.repositories.AccountRepository;
import com.invoicefair.server.repositories.TotalRepository;
import com.invoicefair.server.services.BalanceService;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BalanceServiceImpl implements BalanceService {

    private final AccountRepository accountRepository;
    private final TotalRepository totalRepository;

    @Override
    public Balance findOne(String username) throws NotFoundException {
        AccountEntity accountEntity = accountRepository.findByUsername(username).orElseThrow(() -> new NotFoundException(String.format("The account with provided username \"%s\" is not exists", username)));
        List<TotalEntity> totalEntities = totalRepository.findByAccountId(accountEntity.getId());


        Account account = Account.fromEntity(accountEntity);
        Total[] totals = totalEntities.stream().map(Total::fromEntity).toArray(Total[]::new);

        return Balance.create(account, totals);
    }
}
