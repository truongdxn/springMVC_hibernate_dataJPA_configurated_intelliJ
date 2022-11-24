package com.example.controllers;

import com.example.entities.Customer;
import com.example.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public String addCustomer(){

        Customer customer = new Customer();
        customer.setName("Truong");
        customer.setAddress("Hue");
        customer.setPhone("0983073723");
        customer.setEmail("truong@gmail.com");
        customerService.save(customer);

        return "add";
    }
}
