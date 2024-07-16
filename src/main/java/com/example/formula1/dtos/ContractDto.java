package com.example.formula1.dtos;

import java.util.Date;

import com.example.formula1.models.Position;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ContractDto {
  private PilotDto pilot;
  private TeamDto team;
  private Date createdAt;
  private Date expiresAt;
  private Position position;

  @Override
  public String toString() {
      return "Contract{" +
              ",pilot=" + pilot.getFirstName() +
              ", team='" + team.getName() + '\'' +
              '}';
  }
}
