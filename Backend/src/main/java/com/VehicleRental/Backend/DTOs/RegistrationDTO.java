package com.VehicleRental.Backend.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegistrationDTO {
    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Size(min = 6)
    private String password;

    @NotNull
    private String role;

    private AddressDTO addressDTO;
    private ContactDTO contactDTO;
}
