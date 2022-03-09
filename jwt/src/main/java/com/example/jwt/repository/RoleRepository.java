package com.example.jwt.repository;

import java.util.Optional;

import com.example.jwt.models.ERole;
import com.example.jwt.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role>  findByName(ERole name);

    
}
