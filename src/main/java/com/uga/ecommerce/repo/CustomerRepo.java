package com.uga.ecommerce.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uga.ecommerce.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

	Optional<Customer> findByEmail(String email);

}
