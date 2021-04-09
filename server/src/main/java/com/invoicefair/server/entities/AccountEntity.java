package com.invoicefair.server.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="accounts")
@Entity
@Data
@NoArgsConstructor
public class AccountEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_account_id")
    @SequenceGenerator(name = "seq_account_id", sequenceName = "seq_account_id")
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "reference")
    private String reference;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;
}
