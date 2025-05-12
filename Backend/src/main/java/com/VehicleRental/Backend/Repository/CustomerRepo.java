package com.VehicleRental.Backend.Repository;

import com.VehicleRental.Backend.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
