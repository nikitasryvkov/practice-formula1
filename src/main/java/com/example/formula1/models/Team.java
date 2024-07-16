package com.example.formula1.models;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team extends BaseEntity {

  private String name;
  private Date createdAt;
  private String country;

  private Set<Contract> contract;

  public Team(String name, Date createdAt, String country) {
    this.name = name;
    this.createdAt = createdAt;
    this.country = country;
  }

  protected Team() {
  }

  @Column(name = "name", length = 255, nullable = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "created_at", nullable = false)
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @Column(name = "country", length = 255, nullable = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @OneToMany(mappedBy = "team")
  public Set<Contract> getContract() {
    return contract;
  }

  public void setContract(Set<Contract> contract) {
    this.contract = contract;
  }
}
