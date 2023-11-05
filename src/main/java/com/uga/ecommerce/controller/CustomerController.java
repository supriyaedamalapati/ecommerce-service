package com.uga.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uga.ecommerce.entity.Customer;
import com.uga.ecommerce.service.CustomerService;

@RestController
public class CustomerController {
	
	Logger logger  = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/signup")
	public String showSingUpForm() {
		return "signup";
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerCustomer(@RequestBody Customer customer){
		
		logger.info("Inside registerCustomer"+ customer);
		
		if(customerService.getCustomerByEmail(customer.getEmail()).isPresent()) {
			return new ResponseEntity<>("Customer Already Present", HttpStatus.ALREADY_REPORTED);
		}
		
		customer = customerService.saveCustomer(customer);
		
		return new ResponseEntity<>("Customer Created", HttpStatus.CREATED);
		
	}
	

}
