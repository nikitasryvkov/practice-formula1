// package com.example.formula1.repositories.impl;

// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.formula1.models.License;
// import com.example.formula1.repositories.LicenseRepository;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

// @Repository
// public class LicenseRepositoryDao implements LicenseRepository {

//   @PersistenceContext
//   private EntityManager entityManager;

//   @Transactional
//   public void addLicense(License license) {
//     entityManager.persist(license);
//   }

//   @Transactional
//   public void deleteLicense(int id) {
//     entityManager.remove(entityManager.find(License.class, id));
//   }

//   @Override
//   public License findLicenseById(int id) {
//     return entityManager.find(License.class, id);
//   }

// }
