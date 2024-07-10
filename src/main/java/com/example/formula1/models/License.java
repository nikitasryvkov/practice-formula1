package com.example.formula1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "licenses")
public class License extends BaseEntity {

  private String name;
  private String type;

  public License(String name, String type) {
    this.name = name;
    this.type = type;
  }

  protected License() {
  }

  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "country")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
