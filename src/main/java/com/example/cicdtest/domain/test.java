package com.example.cicdtest.domain;

import jakarta.persistence.*;

@Entity
public class test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public test(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public test() {

    }
}
