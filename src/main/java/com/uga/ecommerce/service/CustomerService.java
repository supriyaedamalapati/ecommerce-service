package com.uga.ecommerce.service;

import java.util.Optional;

import com.uga.ecommerce.entity.Customer;

public interface CustomerService {
	public Customer getCustomerById(Long id);
	public Optional<Customer> getCustomerByEmail(String email);
	public Customer saveCustomer(Customer customer);
	

}
