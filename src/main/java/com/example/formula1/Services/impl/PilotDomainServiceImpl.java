package com.example.formula1.Services.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formula1.Services.PilotService;
import com.example.formula1.dtos.PilotDto;
import com.example.formula1.models.Contract;
import com.example.formula1.models.Pilot;
import com.example.formula1.models.Position;
import com.example.formula1.models.Team;
import com.example.formula1.repositories.ContractRepository;
import com.example.formula1.repositories.PilotRepository;
import com.example.formula1.repositories.TeamRepository;

@Service
public class PilotDomainServiceImpl implements PilotService {

  @Autowired
  private PilotRepository pilotRepository;

  @Autowired
  private ContractRepository contractRepository;

  @Autowired
  private TeamRepository teamRepository;

  private ModelMapper modelMapper = new ModelMapper();

  @Override
  public void addPilot(PilotDto pilot) {
    Pilot pilotDto = modelMapper.map(pilot, Pilot.class);

    pilotRepository.save(pilotDto);
  }

  @Override
  public void deletePilot(int id) {
    pilotRepository.deleteById(id);
  }

  @Override
  public PilotDto findPilot(int id) {
    Pilot pilotDto = pilotRepository.findById(id);
    return modelMapper.map(pilotDto, PilotDto.class);
  }

  @Override
  public List<PilotDto> findPilotByLicense(String type, int penaltyPoints) {
    List<Pilot> pilotDto = pilotRepository.findPilotByLicense(type, penaltyPoints);
    return List.of(modelMapper.map(pilotDto, PilotDto.class));
    // List<Pilot> list = new ArrayList<>();

    // for (Pilot pilot : pilots) {
    //   Set<Contract> contract = pilot.getContract();
    //   if (contract == null) {
    //     list = Arrays.asList(pilot);
    //     return list;
    //   }
    //   return list;
    // }
    // return list;
  }

  @Override
  public void hiringPilot(int pilotId, int teamId, Date createdAt, Date expiresAt, Position position, String typeLicense) {
    Pilot pilot = pilotRepository.findById(pilotId);
    Team team = teamRepository.findById(teamId);
    Contract contractSearch = contractRepository.findContractByPilotId(pilotId);

    if(pilot == null) {
      System.out.println("Такого пилота не существует");
      return;
    }

    if(pilotRepository.findPilotByLicenseById(typeLicense, pilotId) == null) {
      System.out.println("Тип лицензии не соответствует ожидаемой");
      return;
    }

    if(contractSearch == null) {
      Contract contract = new Contract(pilot, team, createdAt, expiresAt, position);
      contractRepository.save(contract);
      return;
    } else if(contractRepository.findContractByPilotId(pilotId).getTeam().getId() == teamId) {
      System.out.println("С этой командой контракт уже существует");
      return;
    } else {
      Contract contract = new Contract(pilot, team, createdAt, expiresAt, position);
      contractRepository.save(contract);
      return;
    }

  }

  @Override
  public PilotDto findPilotByLicenseById(String type, int id) {
    Pilot pilotDto = pilotRepository.findPilotByLicenseById(type, id);

    return modelMapper.map(pilotDto, PilotDto.class);
  }


  @Override
  public void findYoungPilotInTeam(int teamId) {
    Team team = teamRepository.findById(teamId);
    List<Pilot> pilots = pilotRepository.findPilotByTeam(teamId);

    Collections.sort(pilots, new Comparator<Pilot>() {
      @Override
      public int compare(Pilot p1, Pilot p2) {
        return p1.getDateOfBirth().getYear() - p2.getDateOfBirth().getYear();
      }
    });

    if(team == null) {
      System.out.println("Такой команды не существует");
      return;
    }

    Collections.reverse(pilots);
    System.out.println(pilots.get(0));

  }

  @Override
  public List<PilotDto> findPilotByTeam(int idt) {
    List<Pilot> pilotDto = pilotRepository.findPilotByTeam(idt);

    return List.of(modelMapper.map(pilotDto, PilotDto.class));
  }}

  // @Override
  // public List<Pilot> findFreePilotsByLicenseAndPenaltyPoints(String type, int penaltyPoints) {

  // }



  // @Override
  // public Pilot findPilotIsNull(Integer id) {
  //   Pilot pilot = pilotRepository.findById(id);
  //   if(pilot.getContract().isEmpty()) {
  //     return pilot;
  //   } else {
  //     return null;
  //   }
  // }




