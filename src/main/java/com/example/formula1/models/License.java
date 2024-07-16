package com.example.formula1.models;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "licenses")
public class License extends BaseEntity {

  private String name;
  private String type;

  private Set<LicenseDistribution> licenseDistributions;

  public License(String name, String type) {
    this.name = name;
    this.type = type;
  }

  protected License() {
  }

  @Column(name = "name", length = 255, nullable = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "type", length = 255, nullable = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @OneToMany(mappedBy = "license")
  public Set<LicenseDistribution> getLicenseDistributions() {
    return licenseDistributions;
  }

  public void setLicenseDistributions(Set<LicenseDistribution> licenseDistributions) {
    this.licenseDistributions = licenseDistributions;
  }

}
