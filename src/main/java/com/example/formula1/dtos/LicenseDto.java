package com.example.formula1.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class LicenseDto {
  private String name;
  private String type;
}
