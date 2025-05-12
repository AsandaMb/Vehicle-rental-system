package com.VehicleRental.Backend.Repository;

import com.VehicleRental.Backend.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
