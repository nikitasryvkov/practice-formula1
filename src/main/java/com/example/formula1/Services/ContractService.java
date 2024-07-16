package com.example.formula1.Services;

import java.util.List;

import com.example.formula1.dtos.ContractDto;
import com.example.formula1.models.Contract;

public interface ContractService {

  void addContract(ContractDto contract);
  void deleteContract(int id);
  Contract findContract(int id);
  Contract findContractByPilotId(int idp);
  List<ContractDto> findContractByTeam(int idt);

}
