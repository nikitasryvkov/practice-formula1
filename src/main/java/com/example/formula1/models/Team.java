package com.example.formula1.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team extends BaseEntity {

  private String name;
  private Date createdAt;
  private String country;

  public Team(String name, Date createdAt, String country) {
    this.name = name;
    this.createdAt = createdAt;
    this.country = country;
  }

  protected Team() {
  }

  @JoinColumn(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @JoinColumn(name = "created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @JoinColumn(name = "country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
