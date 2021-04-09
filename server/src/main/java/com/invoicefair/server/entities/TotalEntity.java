package com.invoicefair.server.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name="totals")
@Entity
@Data
@NoArgsConstructor
public class TotalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_total_id")
    @SequenceGenerator(name = "seq_total_id", sequenceName = "seq_total_id")
    @Column(name = "id")
    private Long id;

    @Column(name = "balance")
    private BigDecimal balance;

    @ManyToOne()
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_currency_total"))
    private CurrencyEntity currency;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_account_total"))
    private AccountEntity account;
}
