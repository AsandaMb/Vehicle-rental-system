package com.VehicleRental.Backend.DTOs;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class vehicleDTO {

    private String make;
    private String Model;
    private int year;
    @Lob
    private String imageBase64;
    private String status;
}
