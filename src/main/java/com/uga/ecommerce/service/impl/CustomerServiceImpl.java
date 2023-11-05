package com.uga.ecommerce.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uga.ecommerce.entity.Customer;
import com.uga.ecommerce.repo.CustomerRepo;
import com.uga.ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Customer getCustomerById(Long id) {
		
		Optional<Customer> customer = customerRepo.findById(id);
		
		return customer.get();
	}

	@Override
	public Optional<Customer> getCustomerByEmail(String email) {
		
		return customerRepo.findByEmail(email);
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		customerRepo.save(customer);
		
		return customer;
	}

}
