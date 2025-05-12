package com.VehicleRental.Backend.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String firstName;
    private String lastName;

    private ContactDTO contactDTO;
    private AddressDTO addressDTO;
}
