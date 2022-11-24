package com.example.services;

import com.example.entities.Customer;
import org.springframework.stereotype.Service;


public interface CustomerService{
    Customer save(Customer customer);
}
