// package com.example.formula1.repositories.impl;

// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.formula1.models.Team;
// import com.example.formula1.repositories.TeamRepository;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

// @Repository
// public class TeamRepositoryDao implements TeamRepository {

//   @PersistenceContext
//   private EntityManager entityManager;

//   @Transactional
//   public void addTeam(Team team) {
//     entityManager.persist(team);
//   }

//   @Transactional
//   public void deleteTeam(int id) {
//     entityManager.remove(entityManager.find(Team.class, id));
//   }

//   @Override
//   public Team findTeamById(int id) {
//     return entityManager.find(Team.class, id);
//   }

// }
