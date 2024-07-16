// package com.example.formula1.repositories.impl;

// import java.util.List;
// import java.util.Set;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.formula1.models.Contract;
// import com.example.formula1.models.Pilot;
// import com.example.formula1.repositories.PilotRepository;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

// @Repository
// public class PilotRepositoryDao implements PilotRepository {

//   @Autowired
//   private BasePilotRepo basePilotRepo;

//   @PersistenceContext
//   private EntityManager entityManager;

//   @Transactional
//   public void addPilot(Pilot pilot) {
//     entityManager.persist(pilot);
//   }

//   @Transactional
//   public void deletePilot(int id) {
//     entityManager.remove(entityManager.find(Pilot.class, id));
//   }

//   @Override
//   public Pilot findPilotById(int id) {
//     return entityManager.find(Pilot.class, id);
//   }

//   @Override
//   public List<Pilot> findPilotByLicense(String type) {
//     return basePilotRepo.findPilotByLicense(type);
//   }

//   @Override
//   public Pilot findByPilotIsNull(Integer id) {
//     return basePilotRepo.findByPilotIsNull(id);
//   }

// }

// @Repository
// interface BasePilotRepo extends JpaRepository<Pilot, Integer> {

//   //pilots who have a certain type of license
//   // @Query("SELECT new FROM Cars c JOIN c.model p JOIN p.brand a")
//  @Query(value = "SELECT p from Pilot p JOIN p.licenseDistributions ld JOIN ld.license l where l.type = :type")
// //  @Query(value = "SELECT * FROM pilots pl JOIN license_distribution lb ON pl.id=lb.idp JOIN licenses l ON l.id=lb.idl WHERE l.type= :type")

// // @Query(value = "SELECT p FROM Pilot AS p " +
// //             "INNER JOIN LicenseDistribution as lb ON p.id = lb.idp " +
// //             "INNER JOIN License AS l ON l.id = lb.idl WHERE l.type = :type1")
//   List<Pilot> findPilotByLicense(@Param(value = "type") String type1);

//   @Query(value = "select p from Pilot p " +
//   "join p.contract co where p.contract is null")
//   Pilot findByPilotIsNull(@Param(value = "contract") Integer id);

// }
