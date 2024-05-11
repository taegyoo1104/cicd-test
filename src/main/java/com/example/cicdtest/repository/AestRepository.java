package com.example.cicdtest.repository;

import com.example.cicdtest.domain.Aest;
import org.aspectj.weaver.ast.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AestRepository extends JpaRepository<Aest, Long> {
}
