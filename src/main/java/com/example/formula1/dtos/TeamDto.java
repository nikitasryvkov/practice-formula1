package com.example.formula1.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TeamDto {
  private String name;
  private String createdAt;
  private String country;
  private int pilotId;
}
