package com.example.formula1.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "pilots")
public class Pilot extends BaseEntity {

  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private String gender;
  private String country;

  public Pilot(String firstName, String lastName, Date dateOfBirth, String gender, String country) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.country = country;
  }

  protected Pilot() {
  }

  @Column(name = "first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Column(name = "last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Column(name = "birth_day")
  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  @Column(name = "gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Column(name = "country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
