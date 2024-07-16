package com.example.formula1.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.formula1.models.Contract;
import com.example.formula1.models.Pilot;

import jakarta.persistence.EntityManager;

public interface PilotRepository extends JpaRepository<Pilot, Integer> {

  public Pilot findById(int id);

  @Query(value = "SELECT p from Pilot p JOIN p.licenseDistributions ld JOIN ld.license l where l.type = :type and ld.penaltyPoints <= :penaltyPoints")
  List<Pilot> findPilotByLicense(@Param(value = "type") String type, @Param(value = "penaltyPoints") int penaltyPoints);

  @Query(value = "SELECT p from Pilot p JOIN p.licenseDistributions ld JOIN ld.license l where l.type = :type AND p.id = :id")
  Pilot findPilotByLicenseById(@Param(value = "type") String type, @Param(value = "id") int id);

  @Query(value = "SELECT p from Pilot p JOIN FETCH p.contract ct JOIN FETCH ct.team tm where tm.id = :idt")
  List<Pilot> findPilotByTeam(@Param(value = "idt") int idt);

  // @Autowired
  // private EntityManager entityManager;

  // void addPilot(Pilot pilot);
  // void deletePilot(int id);
  // Pilot findPilotById(int id);

  // // //pilots who don't have contracts
  // Pilot findByPilotIsNull(Integer id);

  // //pilots who have a certain type of license
  // List<Pilot> findPilotByLicense(String type);

  // //pilots who have penalty points less than the set value
  // @Query(value = "select p from Pilot p " + "join p.licenseDistribution ld where ld.penaltyPoints <= :penaltyPoints")
  // List<Pilot> findAllByTypeAndPenaltyPoints(@Param(value = "penaltyPoints") Integer penaltyPoints);

  //  @Query(value = "select p from Pilot p " +
  //  "join p.contract co where p.contract is null")
  //  Pilot findByPilotIsNull(@Param(value = "contract") Integer id);

}
