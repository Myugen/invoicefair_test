package com.invoicefair.server.services;

import com.invoicefair.server.domain.Balance;
import javassist.NotFoundException;

public interface BalanceService {
    Balance findOne(String username) throws NotFoundException;
}
