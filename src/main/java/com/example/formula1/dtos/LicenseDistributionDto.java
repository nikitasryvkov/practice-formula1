package com.example.formula1.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class LicenseDistributionDto {
  private int pilotId;
  private int licenseId;
  private String createdAt;
  private int penaltyPoints;
}
