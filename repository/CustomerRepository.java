package com.nineleaps.vegetablestoresystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.vegetablestoresystem.entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Optional<Customer> findByUsernameAndPassword(String username, String password);

}
