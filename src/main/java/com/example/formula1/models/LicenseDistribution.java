package com.example.formula1.models;

import java.util.Date;

import jakarta.persistence.*;

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
  @JoinColumn(name = "pilot")
  public Pilot getPilot() {
    return pilot;
  }

  public void setPilot(Pilot pilot) {
    this.pilot = pilot;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "license")
  public License getLicense() {
    return license;
  }

  public void setLicense(License license) {
    this.license = license;
  }

  @JoinColumn(name = "created_at")
  public Date createdAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @JoinColumn(name = "penalty_points")
  public int getPenaltyPoints() {
    return penaltyPoints;
  }

  public void setPenaltyPoints(int penaltyPoints) {
    this.penaltyPoints = penaltyPoints;
  }
}
