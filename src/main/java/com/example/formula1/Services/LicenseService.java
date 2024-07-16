package com.example.formula1.Services;

import com.example.formula1.dtos.LicenseDto;
import com.example.formula1.models.License;

public interface LicenseService {

  void addLicense(LicenseDto license);
  void deleteLicense(int id);
  LicenseDto findLicense(int id);

}
