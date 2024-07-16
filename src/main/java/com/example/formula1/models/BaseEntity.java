package com.example.formula1.models;

import jakarta.persistence.*;

@MappedSuperclass
public class BaseEntity {

  protected int id;

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
      return id;
  }

  protected void setId(int id) {
      this.id = id;
  }
}
