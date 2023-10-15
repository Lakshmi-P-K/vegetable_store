package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.vegetablestoresystem.entity.Customer;
import com.nineleaps.vegetablestoresystem.repository.CustomerRepository;
@Service
public class CustomerServiceimpl implements ICustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Optional<Customer> getCustomerById(Long customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		customerRepository.deleteById(customerId);
		
	}

	@Override
	public Optional<Customer> findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return customerRepository.findByUsernameAndPassword(username,password);
	}

	@Override
	public Customer insertCustomer(Customer newcustomer) {
		// TODO Auto-generated method stub
		return customerRepository.save(newcustomer) ;
	}

}
