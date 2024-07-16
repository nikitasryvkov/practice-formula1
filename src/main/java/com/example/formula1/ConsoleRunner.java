// package com.example.formula1;

// import java.util.Arrays;
// import java.util.Date;
// import java.util.List;

// import org.modelmapper.ModelMapper;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// import com.example.formula1.Services.ContractService;
// import com.example.formula1.Services.LicenseDistributionService;
// import com.example.formula1.Services.LicenseService;
// import com.example.formula1.Services.PilotService;
// import com.example.formula1.Services.TeamService;
// import com.example.formula1.dtos.ContractDto;
// import com.example.formula1.dtos.LicenseDistributionDto;
// import com.example.formula1.dtos.LicenseDto;
// import com.example.formula1.models.Contract;
// import com.example.formula1.models.Gender;
// import com.example.formula1.models.License;
// import com.example.formula1.models.LicenseDistribution;
// import com.example.formula1.models.Pilot;
// import com.example.formula1.models.Position;
// import com.example.formula1.models.Team;

// @Component
// public class ConsoleRunner implements CommandLineRunner {

//   @Autowired
//   private PilotService pilotService;

//   @Autowired
//   private TeamService teamService;

//   @Autowired
//   private LicenseService licenseService;

//   @Autowired
//   private LicenseDistributionService licenseDistributionService;

//   @Autowired
//   private ContractService contractService;

//   ModelMapper modelMapper = new ModelMapper();

//   @Override
//   public void run (String... strings) throws Exception {

//     Pilot pilot1 = new Pilot("Nick", "Sryv", new Date(102, 04, 18), Gender.MALE, "Russia");
//     pilotService.addPilot(pilot1);

//     Pilot pilot2 = new Pilot("Vlad", "Zhelt", new Date(102, 03, 14), Gender.MALE, "Russia");
//     pilotService.addPilot(pilot2);

//     Pilot pilot3 = new Pilot("Liza", "Vas", new Date(104, 06, 03), Gender.FEMALE, "Russia");
//     pilotService.addPilot(pilot3);

//     Pilot pilot4 = new Pilot("Den", "Sot", new Date(106, 06, 03), Gender.MALE, "Russia");
//     pilotService.addPilot(pilot4);

//     Team team1 = new Team("Mers", new Date(50, 01, 01), "Germany");
//     teamService.addTeam(team1);

//     Team team2 = new Team("Red", new Date(50, 01, 01), "Germany");
//     teamService.addTeam(team2);

//     License license1 = new License("Супер лицензия", "Аа");
//     LicenseDto licenseDto = modelMapper.map(license1, LicenseDto.class);
//     licenseService.addLicense(licenseDto);

//     // License license2 = new License("Супер лицензия", "Ба");
//     // licenseService.addLicense(license2);

//     LicenseDistribution licenseDistribution1 = new LicenseDistribution(pilot1, licenseDto, new Date(120, 01, 01), 5);
//     LicenseDistributionDto licenseDistributionDto = modelMapper.map(licenseDistribution1, LicenseDistributionDto.class);
//     licenseDistributionService.addLicenseDistribution(licenseDistributionDto);

//     // LicenseDistribution licenseDistribution2 = new LicenseDistribution(pilot2, licenseDto, new Date(120, 01, 01), 4);
//     // licenseDistributionService.addLicenseDistribution(licenseDistribution2);

//     // LicenseDistribution licenseDistribution3 = new LicenseDistribution(pilot3, licenseDto, new Date(120, 01, 01), 4);
//     // licenseDistributionService.addLicenseDistribution(licenseDistribution3);

//     // LicenseDistribution licenseDistribution4 = new LicenseDistribution(pilot4, licenseDto, new Date(120, 01, 01), 7);
//     // licenseDistributionService.addLicenseDistribution(licenseDistribution4);

//     pilotService.hiringPilot(1, 2, new Date(120, 01, 01), new Date(126, 01, 01), Position.SECOND, "Аа");
//     pilotService.hiringPilot(2, 1, new Date(120, 01, 01), new Date(126, 01, 01), Position.SECOND, "Аа");
//     pilotService.hiringPilot(4, 2, new Date(120, 01, 01), new Date(126, 01, 01), Position.SECOND, "Аа");

//     // Contract contract1 = new Contract(pilot1, team1, , 2003-01-02, Position.FIRST);
//     // ContractDto contractDto1 = modelMapper.map(contract1, ContractDto.class);
//     // contractService.addContract(contractDto1);

//     // Contract contract2 = new Contract(pilot3, team2, new Date(119, 01, 01), new Date(124, 01, 01), Position.FIRST);
//     // ContractDto contractDto2 = modelMapper.map(contract2, ContractDto.class);
//     // contractService.addContract(contractDto2);

//     // Contract contract3 = new Contract(pilot4, team2, new Date(119, 01, 01), new Date(124, 01, 01), Position.FIRST);
//     // ContractDto contractDto3 = modelMapper.map(contract3, ContractDto.class);
//     // contractService.addContract(contractDto3);

//     // pilotService.findYoungPilotInTeam(2);

//     // System.out.println(pilotService.findPilotByTeam(1));
//     // System.out.println(contractService.findContractByTeam(1));
//     // System.out.println(pilotService.findPilotByLicense("Аа", 4));
//     // System.out.println(pilotService.findPilotByLicenseById("Аа", 3));
//     System.out.println(contractService.findContractByPilotId(1));

//     // pilotService.hiringPilot(1, 1, java.sql.Date.valueOf("2003-01-01"), java.sql.Date.valueOf("2004-01-01"), Position.FIRST, "Аа");
//     // System.out.println(pilotService.findPilotIsNull(1));

//   }

// }
