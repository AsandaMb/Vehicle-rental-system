package com.VehicleRental.Backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentId;
    private double amount;
    private long invoiceNumber;
    @CreationTimestamp
    private LocalDateTime paymentData;
    private String paymentMethod;
    private String paymentStatus;
    @OneToOne
    @JoinColumn(name = "rentalId", nullable = false)
    private RentalInfo rentalInfo;


}
