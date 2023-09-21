package com.bank.api.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "tb_account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;
}
