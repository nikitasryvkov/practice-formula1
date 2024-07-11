package com.example.formula1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formula1.models.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
