// package com.example.formula1.repositories.impl;

// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.formula1.models.Contract;
// import com.example.formula1.repositories.ContractRepository;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

// @Repository
// public class ContractRepositoryDao implements ContractRepository {

//   @PersistenceContext
//   private EntityManager entityManager;

//   @Transactional
//   public void addContract(Contract contract) {
//     entityManager.persist(contract);
//   }

//   @Transactional
//   public void deleteContract(int id) {
//     entityManager.remove(entityManager.find(Contract.class, id));
//   }

//   @Override
//   public Contract findContractById(int id) {
//     return entityManager.find(Contract.class, id);
//   }

// }
