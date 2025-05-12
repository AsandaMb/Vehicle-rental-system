package com.VehicleRental.Backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String firstName;
    private String lastName;
    private String password;
    @OneToOne
    @JoinColumn(name = "contactId", nullable = false)
    private Contact contact;
    @ManyToOne
    @JoinColumn(name = "addressId", nullable = false)
    private Address address;

}
