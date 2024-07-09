package com.example.formula1.models;

import jakarta.persistence.*;

@MappedSuperclass
public class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JoinColumn(name = "id")
  protected int id;

  public int getId() {
      return id;
  }

  protected void setId(int id) {
      this.id = id;
  }
}
