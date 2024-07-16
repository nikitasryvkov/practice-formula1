package com.example.formula1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formula1.models.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

  public Team findById(int id);

}
