package com.VehicleRental.Backend.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private String streetName;
    private int houseNumber;
    private String city;
    private String postalCode;
}
