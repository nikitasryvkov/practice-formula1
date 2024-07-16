// package com.example.formula1.repositories.impl;

// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.formula1.models.LicenseDistribution;
// import com.example.formula1.repositories.LicenseDistributionRepository;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

// @Repository
// public class LicenseDistributionRepositoryDao implements LicenseDistributionRepository {

//   @PersistenceContext
//   private EntityManager entityManager;

//   @Transactional
//   public void addLicenseDistribution(LicenseDistribution licenseDistribution) {
//     entityManager.persist(licenseDistribution);
//   }

//   @Transactional
//   public void deleteLicenseDistribution(int id) {
//     entityManager.remove(entityManager.find(LicenseDistribution.class, id));
//   }

//   @Override
//   public LicenseDistribution findLicenseDistributionById(int id) {
//     return entityManager.find(LicenseDistribution.class, id);
//   }

// }
