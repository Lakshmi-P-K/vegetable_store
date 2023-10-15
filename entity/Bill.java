package com.nineleaps.vegetablestoresystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	private Long billId;
	@Column(name = "bill_total_amount",nullable = false)
	private Integer billTotalAmount;
	@Column(name ="bill_description")
	private String billDescription; 
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_customer_customer_id")
	private Customer customer; 
	
	
	public Bill() {
		
	}


	public Bill(Long billId, Integer billTotalAmount, String billDescription, Customer customer) {
		super();
		this.billId = billId;
		this.billTotalAmount = billTotalAmount;
		this.billDescription = billDescription;
		this.customer = customer;
	}


	public Long getBillId() {
		return billId;
	}


	public void setBillId(Long billId) {
		this.billId = billId;
	}


	public Integer getBillTotalAmount() {
		return billTotalAmount;
	}


	public void setBillTotalAmount(Integer billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}


	public String getBillDescription() {
		return billDescription;
	}


	public void setBillDescription(String billDescription) {
		this.billDescription = billDescription;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billTotalAmount=" + billTotalAmount + ", billDescription="
				+ billDescription + ", customer=" + customer + "]";
	}

	

}
