package com.nineleaps.vegetablestoresystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "customer")

public class Customer {
	
	@Id
	@Column(name= "customerid",nullable=false)
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long customerId;
	
	@Size(min=3,message="customer should have alteast 3 characters")
	@Column(name ="customername",nullable=false)
	private String customerName;
	@Email
	@Column(name="customeremail",nullable=false)
	private String customerEmail ;
	
	
	
	@Column(name="customermobileno",nullable=false)
	private String customerMobileno;
	
	@Column(name = "customer_house_number",nullable = false)
	  private String customerHouseNumber;
	  @Column(name = "customer_street",nullable = false)
	  private String customerStreet;
	  @Column(name = "customer_city",nullable = false)
	  private String customerCity;
	  @Column(name = "customer_country",nullable = false)
	  private String customerCountry;
	  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/mm/dd")
	  @Column(name = "customer_date_of_birth",nullable = false)
	  private String customerDateOfBirth;
	  @Column(name = "customer_age")
	  private int customerAge;
	  @Column(name = "username",nullable = false)
	  private String username;
	  @Column(name = "password",nullable = false)
	  private String password;
	  
	  public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Long customerId,
			@Size(min = 3, message = "customer should have alteast 3 characters") String customerName,
			@Email String customerEmail,
			String customerMobileno,
			String customerHouseNumber, String customerStreet, String customerCity, String customerCountry,
			String customerDateOfBirth, int customerAge, String username, String password) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerMobileno = customerMobileno;
		this.customerHouseNumber = customerHouseNumber;
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
		this.customerCountry = customerCountry;
		this.customerDateOfBirth = customerDateOfBirth;
		this.customerAge = customerAge;
		this.username = username;
		this.password = password;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerMobileno() {
		return customerMobileno;
	}

	public void setCustomerMobileno(String customerMobileno) {
		this.customerMobileno = customerMobileno;
	}

	public String getCustomerHouseNumber() {
		return customerHouseNumber;
	}

	public void setCustomerHouseNumber(String customerHouseNumber) {
		this.customerHouseNumber = customerHouseNumber;
	}

	public String getCustomerStreet() {
		return customerStreet;
	}

	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerDateOfBirth() {
		return customerDateOfBirth;
	}

	public void setCustomerDateOfBirth(String customerDateOfBirth) {
		this.customerDateOfBirth = customerDateOfBirth;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerMobileno=" + customerMobileno + ", customerHouseNumber="
				+ customerHouseNumber + ", customerStreet=" + customerStreet + ", customerCity=" + customerCity
				+ ", customerCountry=" + customerCountry + ", customerDateOfBirth=" + customerDateOfBirth
				+ ", customerAge=" + customerAge + ", username=" + username + ", password=" + password + "]";
	}
	  

	
	  

}
