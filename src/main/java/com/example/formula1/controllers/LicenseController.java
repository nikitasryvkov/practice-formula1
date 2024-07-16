package com.example.formula1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.formula1.Services.LicenseService;
import com.example.formula1.dtos.LicenseDto;

@RestController
@RequestMapping("/api/license")
public class LicenseController {

  @Autowired
  private LicenseService licenseService;

  @GetMapping("/{id}")
  public LicenseDto getLicenseById(@PathVariable() int id) {
    return licenseService.findLicense(id);
  }

}
