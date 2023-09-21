package com.bank.api.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "tb_card")
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    @Column(name = "additional_limit", scale = 13, precision = 2)
    private BigDecimal limit;
}
