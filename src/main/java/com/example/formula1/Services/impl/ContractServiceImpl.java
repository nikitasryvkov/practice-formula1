package com.example.formula1.Services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formula1.Services.ContractService;
import com.example.formula1.dtos.ContractDto;
import com.example.formula1.models.Contract;
import com.example.formula1.repositories.ContractRepository;

@Service
public class ContractServiceImpl implements ContractService {

  @Autowired
  private ContractRepository contractRepository;
  private ModelMapper modelMapper = new ModelMapper();

  @Override
  public void addContract(ContractDto contract) {
    Contract contractToAdd = modelMapper.map(contract, Contract.class);

    contractRepository.save(contractToAdd);
  }

  @Override
  public void deleteContract(int id) {
    contractRepository.deleteById(id);
  }

  @Override
  public Contract findContract(int id) {
    return contractRepository.findById(id);
  }

  @Override
  public Contract findContractByPilotId(int idp) {
    return contractRepository.findContractByPilotId(idp);
  }

  @Override
  public List<ContractDto> findContractByTeam(int idt) {
    return contractRepository.findContractByTeam(idt).stream().map(s -> modelMapper.map(s, ContractDto.class)).collect(Collectors.toList());
  }

}
