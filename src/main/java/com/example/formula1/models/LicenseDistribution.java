package com.example.formula1.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "license_distribution")
public class LicenseDistribution extends BaseEntity {

  private Pilot pilot;
  private License license;
  private Date createdAt;
  private int penaltyPoints;

  public LicenseDistribution(Pilot pilot, License license, Date createdAt, int penaltyPoints) {
    this.pilot = pilot;
    this.license = license;
    this.createdAt = createdAt;
    this.penaltyPoints = penaltyPoints;
  }

  protected LicenseDistribution() {
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_pilot", referencedColumnName = "id")
  public Pilot getPilot() {
    return pilot;
  }

  public void setPilot(Pilot pilot) {
    this.pilot = pilot;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_license", referencedColumnName = "id")
  public License getLicense() {
    return license;
  }

  public void setLicense(License license) {
    this.license = license;
  }

  @Column(name = "created_at")
  public Date createdAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @Column(name = "penalty_points")
  public int getPenaltyPoints() {
    return penaltyPoints;
  }

  public void setPenaltyPoints(int penaltyPoints) {
    this.penaltyPoints = penaltyPoints;
  }
}
