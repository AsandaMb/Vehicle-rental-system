package com.VehicleRental.Backend.Services;

import com.VehicleRental.Backend.DTOs.AddressDTO;
import com.VehicleRental.Backend.DTOs.ContactDTO;
import com.VehicleRental.Backend.DTOs.RegistrationDTO;
import com.VehicleRental.Backend.Model.Address;
import com.VehicleRental.Backend.Model.Contact;
import com.VehicleRental.Backend.Model.Customer;
import com.VehicleRental.Backend.Model.Employee;
import com.VehicleRental.Backend.Repository.CustomerRepo;
import com.VehicleRental.Backend.Repository.EmployeeRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final BCryptPasswordEncoder passwordEncoder;
    private final CustomerRepo customerRepo;
    private final EmployeeRepo employeeRepo;

    public RegistrationService(CustomerRepo customerRepo, EmployeeRepo employeeRepo, BCryptPasswordEncoder passwordEncoder){
        this.customerRepo = customerRepo;
        this.employeeRepo = employeeRepo;
        this.passwordEncoder = passwordEncoder;
    }

    private Contact toContact(ContactDTO dto){
        Contact contact = new Contact();
        contact.setPhoneNumber(dto.getPhoneNumbers());
        contact.setEmailAddress(dto.getEmailAddress());
        return contact;
    }

    private Address toAddress(AddressDTO dto){
        Address address = new Address();
        address.setCity(dto.getCity());
        address.setHouseNumber(dto.getHouseNumber());
        address.setStreetName(dto.getStreetName());
        address.setPostalCode(dto.getPostalCode());
        return address;
    }

    public void registerUser(RegistrationDTO dto){
        Contact contact = toContact(dto.getContactDTO());
        Address address = toAddress(dto.getAddressDTO());


        if("CUSTOMER".equalsIgnoreCase(dto.getRole())){
            Customer customer = new Customer();
            customer.setFirstName(dto.getFirstName());
            customer.setLastName(dto.getLastName());
            String hashedPassword = passwordEncoder.encode(dto.getPassword());
            customer.setPassword(hashedPassword);
            customer.setContact(contact);
            customer.setAddress(address);
            customerRepo.save(customer);

        } else if ("EMPLOYEE".equalsIgnoreCase(dto.getRole())) {
            Employee employee = new Employee();
            employee.setFirstName(dto.getFirstName());
            employee.setLastName(dto.getLastName());
            String hashedPassword = passwordEncoder.encode(dto.getPassword());
            employee.setPassword(hashedPassword);
            employee.setContact(contact);
            employee.setAddress(address);
            employeeRepo.save(employee);
        }else
            throw new IllegalArgumentException("Invalid role: " + dto.getRole());

    }


}
