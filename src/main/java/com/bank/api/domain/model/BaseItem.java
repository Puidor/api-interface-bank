package com.bank.api.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;
    private String description;
}
