package com.example.cicdtest.repository;

import com.example.cicdtest.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
