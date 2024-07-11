package com.example.formula1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formula1.models.Pilot;

public interface PilotRepository extends JpaRepository<Pilot, Integer> {

}
