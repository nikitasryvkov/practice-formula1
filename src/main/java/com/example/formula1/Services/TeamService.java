package com.example.formula1.Services;

import com.example.formula1.dtos.TeamDto;
import com.example.formula1.models.Team;

public interface TeamService {

  void addTeam(TeamDto team);
  void deleteTeam(int id);
  Team findTeam(int id);

}
