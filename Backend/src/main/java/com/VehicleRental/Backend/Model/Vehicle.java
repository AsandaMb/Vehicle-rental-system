package com.VehicleRental.Backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vehicleId;
    private String numberplate;
    private double mileage;
    private String make;
    private String Model;
    private int year;
    @Lob
    private byte[] image;
    private String status;


}
