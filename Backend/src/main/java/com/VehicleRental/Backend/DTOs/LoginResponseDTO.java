package com.VehicleRental.Backend.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginResponseDTO {
    private String token;
    private String type = "Bearer";
    private String username;
    private String role;
}
