package com.example.formula1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formula1.models.License;

public interface LicenseRepository extends JpaRepository<License, Integer> {
}
