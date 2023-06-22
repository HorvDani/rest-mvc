package com.example.restmvc.services;

import com.example.restmvc.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface CustomerService {

    List<Customer> listCustomers();
    Customer getCustomerById(UUID id);
    Customer saveNewCustomer(Customer customer);

    void updateByCustomerId(UUID customerId, Customer customer);

    void deleteById(UUID customerId);

    void patchCustomerById(UUID customerId, Customer customer);
}
