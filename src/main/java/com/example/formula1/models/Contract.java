package com.example.formula1.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "contracts")
public class Contract extends BaseEntity {

  private Pilot pilot;
  private Team team;
  private Date createdAt;
  private Date expiresAt;
  private String position;

  public Contract(Pilot pilot, Team team, Date createdAt, Date expiresAt, String position) {
    this.pilot = pilot;
    this.team = team;
    this.createdAt = createdAt;
    this.expiresAt = expiresAt;
    this.position = position;
  }

  protected Contract() {
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
  @JoinColumn(name = "team")
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  @JoinColumn(name = "created_at")
  public Date createdAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @JoinColumn(name = "expires_at")
  public Date expiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Date expiresAt) {
    this.expiresAt = expiresAt;
  }

  @JoinColumn(name = "gender")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }
}
