package com.example.services;

import com.example.entities.Customer;
import com.example.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

}
