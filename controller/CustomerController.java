package com.nineleaps.vegetablestoresystem.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.vegetablestoresystem.entity.Customer;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.service.ICustomerService;



@CrossOrigin("*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/listcustomer")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@PostMapping("/savecustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	
	
	@PutMapping("/updatecustomer/{customer_id}")
	public Customer updateCustomer(@Valid @RequestBody Customer newCustomer,@PathVariable("customer_id") Long customerId) throws SourceNotFoundException {
		Customer customer =  customerService.getCustomerById(customerId)
				.orElseThrow(() -> new SourceNotFoundException("customer not exists with id" +customerId));

		customer.setCustomerName(newCustomer.getCustomerName());
		
		
		customer.setCustomerEmail(newCustomer.getCustomerEmail());
		
		customer.setCustomerHouseNumber(newCustomer.getCustomerHouseNumber());
		customer.setCustomerStreet(newCustomer.getCustomerStreet());
		customer.setCustomerCity(newCustomer.getCustomerCity());
		customer.setCustomerCountry(newCustomer.getCustomerCountry());
		customer.setCustomerDateOfBirth(newCustomer.getCustomerDateOfBirth());
		customer.setCustomerAge(newCustomer.getCustomerAge());
		customer.setUsername(newCustomer.getUsername());
		customer.setPassword(newCustomer.getPassword());
		
		
		return customerService.updateCustomer(customer);
		
	}
	
	@GetMapping("/findcustomer/{customer_id}")
	public Customer getCustomerById(@PathVariable("customer_id") Long customerId){
		return customerService.getCustomerById(customerId).get();
	}
	
	@DeleteMapping("/deletecustomer/{customer_id}")
	public void deleteCustomerById(@PathVariable("customer_id") Long customerId){
		 customerService.deleteCustomerById(customerId);
	}
	
	@GetMapping("/findbyusernameandpassword/{username}/{password}")
	public Optional<Customer> findByUsernameAndPassword(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		return customerService.findByUsernameAndPassword(username,password);
	}
	

}
