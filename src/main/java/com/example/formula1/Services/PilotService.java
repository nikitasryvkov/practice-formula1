package com.example.formula1.Services;

import java.util.Date;
import java.util.List;

import com.example.formula1.dtos.PilotDto;
import com.example.formula1.models.Pilot;
import com.example.formula1.models.Position;

public interface PilotService {

  void addPilot(PilotDto pilot);
  void deletePilot(int id);
  PilotDto findPilot(int id);
  List<PilotDto> findPilotByLicense(String type, int penaltyPoints);
  PilotDto findPilotByLicenseById(String type, int id);
  void hiringPilot(int pilotId, int teamId, Date createdAt, Date expiresAt, Position position, String typeLicense);
  void findYoungPilotInTeam(int teamId);
  List<PilotDto> findPilotByTeam(int idt);
  // List<Pilot> findFreePilotsByLicenseAndPenaltyPoints(String type, int penaltyPoints);
  // Pilot findPilotIsNull(Integer id);

}
