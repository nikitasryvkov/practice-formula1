package com.example.formula1.models;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "pilots")
public class Pilot extends BaseEntity {

  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private Gender gender;
  private String country;

  private Set<Contract> contract;
  private Set<LicenseDistribution> licenseDistributions;

  public Pilot(String firstName, String lastName, Date dateOfBirth, Gender gender, String country) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.country = country;
  }

  protected Pilot() {
  }

  @Column(name = "first_name", length = 255, nullable = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Column(name = "last_name", length = 255, nullable = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Column(name = "birth_day", nullable = false)
  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  @Column(name = "gender", nullable = false)
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  @Column(name = "country", length = 255, nullable = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @OneToMany(mappedBy = "pilot")
  public Set<Contract> getContract() {
    return contract;
  }

  public void setContract(Set<Contract> contract) {
    this.contract = contract;
  }

  @OneToMany(mappedBy = "pilot")
  public Set<LicenseDistribution> getLicenseDistributions() {
    return licenseDistributions;
  }

  public void setLicenseDistributions(Set<LicenseDistribution> licenseDistributions) {
    this.licenseDistributions = licenseDistributions;
  }

  @Override
    public String toString() {
        return "Pilot{" +
                "id='" + getId() + '\'' +
                ",first_name=" + firstName +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
