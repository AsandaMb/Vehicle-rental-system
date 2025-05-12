package com.VehicleRental.Backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class RentalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long RentalId;
    private double totalCost;
    private LocalDateTime pickUp;
    private  LocalDateTime dropOff;
    private int rentalPeriod;
    @ManyToOne
    @JoinColumn(name = "employeeId", nullable = false)
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "vehicleId", nullable = false)
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

}
