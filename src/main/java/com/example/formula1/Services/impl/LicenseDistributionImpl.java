package com.example.formula1.Services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formula1.Services.LicenseDistributionService;
import com.example.formula1.dtos.LicenseDistributionDto;
import com.example.formula1.models.LicenseDistribution;
import com.example.formula1.repositories.LicenseDistributionRepository;

@Service
public class LicenseDistributionImpl implements LicenseDistributionService {

  @Autowired
  private LicenseDistributionRepository licenseDistributionRepository;

  ModelMapper modelMapper = new ModelMapper();

  @Override
  public void addLicenseDistribution(LicenseDistributionDto licenseDistribution) {
    LicenseDistribution licenseDistributionDto = modelMapper.map(licenseDistribution, LicenseDistribution.class);

    licenseDistributionRepository.save(licenseDistributionDto);
  }

  @Override
  public void deleteLicenseDistribution(int id) {
    licenseDistributionRepository.deleteById(id);
  }

  @Override
  public LicenseDistribution findLicenseDistribution(int id) {
    return licenseDistributionRepository.findById(id);
  }

}
