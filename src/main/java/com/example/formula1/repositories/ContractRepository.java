package com.example.formula1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.formula1.models.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

  public Contract findById(int id);

  // @Query(value = "SELECT pl from Pilot pl JOIN pl.contract c where pl.id = :idp")
  @Query(value = "SELECT ct from Contract ct JOIN FETCH ct.pilot pl JOIN FETCH ct.team tm where pl.id = :idp")
  public Contract findContractByPilotId(@Param(value = "idp") int idp);

  @Query(value = "SELECT ct from Contract ct JOIN FETCH ct.pilot pl JOIN FETCH ct.team tm WHERE tm.id = :idt")
  public List<Contract> findContractByTeam(@Param(value = "idt") int idt);

}
