package com.invoicefair.server.repositories;

import com.invoicefair.server.entities.TotalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TotalRepository extends JpaRepository<TotalEntity, Long> {
    List<TotalEntity> findByAccountId(Long accountId);
}
