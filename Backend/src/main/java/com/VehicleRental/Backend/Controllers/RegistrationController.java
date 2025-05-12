package com.VehicleRental.Backend.Controllers;

import com.VehicleRental.Backend.DTOs.RegistrationDTO;
import com.VehicleRental.Backend.Services.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService){
        this.registrationService = registrationService;
    }


    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody RegistrationDTO dto){
        System.out.println("REACHED CONTROLLER!");
        registrationService.registerUser(dto);
        return ResponseEntity.ok(dto.getRole() + " registered.");
    }

}
