package com.example.formula1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formula1.models.LicenseDistribution;

public interface LicenseDistributionRepository extends JpaRepository<LicenseDistribution, Integer> {
}
