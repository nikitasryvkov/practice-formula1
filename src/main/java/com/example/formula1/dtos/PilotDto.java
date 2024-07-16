package com.example.formula1.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PilotDto {
  private String firstName;
  private String lastName;
  private String dateOfBirth;
  private String gender;
  private String country;
  private int teamId;
  private String licenseType;
  private String position;
}
