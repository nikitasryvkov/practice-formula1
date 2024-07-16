package com.example.formula1.Services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formula1.Services.LicenseService;
import com.example.formula1.dtos.LicenseDto;
import com.example.formula1.models.License;
import com.example.formula1.repositories.LicenseRepository;

@Service
public class LicenseServiceImpl implements LicenseService {

  @Autowired
  private LicenseRepository licenseRepository;

  private ModelMapper modelMapper = new ModelMapper();

  @Override
  public void addLicense(LicenseDto license) {
    License licenseDto = modelMapper.map(license, License.class);
    licenseRepository.save(licenseDto);
  }

  @Override
  public void deleteLicense(int id) {
    licenseRepository.deleteById(id);
  }

  @Override
  public LicenseDto findLicense(int id) {


    return licenseRepository.findById(id);
  }

}
