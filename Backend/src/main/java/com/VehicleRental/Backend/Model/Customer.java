package com.VehicleRental.Backend.Model;

import com.VehicleRental.Backend.Model.Address;
import com.VehicleRental.Backend.Model.Contact;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    private String firstName;
    private String lastName;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactId", nullable = false)
    private Contact contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", nullable = false)
    private Address address;
}
