package com.example.formula1.Services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formula1.Services.TeamService;
import com.example.formula1.dtos.TeamDto;
import com.example.formula1.models.Team;
import com.example.formula1.repositories.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {

  @Autowired
  private TeamRepository teamRepository;

  private ModelMapper modelMapper = new ModelMapper();

  @Override
  public void addTeam(TeamDto team) {
    Team teamDto = modelMapper.map(team, Team.class);

    teamRepository.save(teamDto);
  }

  @Override
  public void deleteTeam(int id) {
    teamRepository.deleteById(id);
  }

  @Override
  public Team findTeam(int id) {
    return teamRepository.findById(id);
  }

}
