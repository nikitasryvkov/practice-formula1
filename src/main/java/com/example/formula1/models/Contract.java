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
  private Position position;

  public Contract(Pilot pilot, Team team, Date createdAt, Date expiresAt, Position position) {
    this.pilot = pilot;
    this.team = team;
    this.createdAt = createdAt;
    this.expiresAt = expiresAt;
    this.position = position;
  }

  protected Contract() {
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idp", referencedColumnName = "id")
  public Pilot getPilot() {
    return pilot;
  }

  public void setPilot(Pilot pilot) {
    this.pilot = pilot;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idt", referencedColumnName = "id")
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  @Column(name = "created_at", nullable = false)
  public Date createdAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @Column(name = "expires_at", nullable = false)
  public Date expiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Date expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Column(name = "position", nullable = false)
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  @Override
  public String toString() {
      return "Contract{" +
              "idContract='" + getId() + '\'' +
              ",idPilot=" + pilot.getId() +
              ",pilot=" + pilot.getFirstName() +
              ", team='" + team.getName() + '\'' +
              '}';
  }
}
