package com.example.cicdtest.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class tttDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
