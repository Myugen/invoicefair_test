package com.invoicefair.server.entities;

import com.invoicefair.server.enums.Currency;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

@Table(name="currencies")
@Entity
@Data
@NoArgsConstructor
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class CurrencyEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_currency_id")
    @SequenceGenerator(name = "seq_currency_id", sequenceName = "seq_currency_id")
    @Column(name = "id")
    private Long id;

    @Column(name = "currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Type(type = "json")
    @Column(name = "conversors", columnDefinition = "json")
    private Map<Currency, BigDecimal> conversors;
}
