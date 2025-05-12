package com.VehicleRental.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long addressId;
    private String streetName;
    private int houseNumber;
    private String city;
    private String postalCode;
}
