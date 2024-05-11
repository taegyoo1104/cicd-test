package com.example.cicdtest.domain;

import jakarta.persistence.*;

@Entity
public class Aest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public Aest(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Aest() {

    }
}
