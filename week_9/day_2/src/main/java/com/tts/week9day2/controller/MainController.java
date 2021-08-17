package com.tts.week9day2.controller;

import com.tts.week9day2.model.Customer;
import com.tts.week9day2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

// RestController is a stereotype annotation that denotes
// specific behaviors regarding web requests and responses
@RestController
public class MainController {

    // below is an example of dependency injection
    // view the autowired annotation
    // this is just one way of injecting this dependency
    @Autowired
    CustomerRepository customerRepository;

    // this getting mapping tells spring to come here, and resolve this method
    // when we reach localhost:8080
//    @GetMapping("/")
//    public String getHome() {
//        return "Hello world";
//    }

    // this method showcases that endpoints can render dynamic data
    // the number that will be displayed at this endpoint will be unique
    // due to the Random class
    @GetMapping("/random")
    public Integer getRandomInteger() {
        Random random = new Random();
        return  random.nextInt(1000);
    }

    @GetMapping("/customer/all")
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    // this mapping has a dynamic element
    // the dynamic element is the "path variable"
    // while it is bound to a parameter, the literal value
    // is completely dynamic
    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        // orElseThrow means it will attempt to unwrap the optional
        // if there's nothing there, it will throw an exception
        return customerRepository.findById(id).orElseThrow();
    }

}
