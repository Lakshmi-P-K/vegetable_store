package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.Customer;



public interface ICustomerService {
	public List<Customer> getAllCustomer();

	public Customer saveCustomer(Customer customer);

	public Optional<Customer> getCustomerById(Long customerId);

	public Customer updateCustomer(Customer customer);

	public void deleteCustomerById(Long customerId);

	public Optional<Customer> findByUsernameAndPassword(String username, String password);

	public Customer insertCustomer(Customer newcustomer);

}
