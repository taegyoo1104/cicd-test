package com.example.cicdtest.domain;

import jakarta.persistence.*;

@Entity
public class ABC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
}
