package com.example.formula1.Services;

import com.example.formula1.dtos.LicenseDistributionDto;
import com.example.formula1.models.LicenseDistribution;

public interface LicenseDistributionService {

  void addLicenseDistribution(LicenseDistributionDto licenseDistribution);
  void deleteLicenseDistribution(int id);
  LicenseDistribution findLicenseDistribution(int id);

}
