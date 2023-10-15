package com.nineleaps.vegetablestoresystem.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "payment")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private Long transactionId;
	@Column(name = "payment_cvvnumber",nullable = false)
	private int cvvNumber;
	@Column(name = "payment_cardnumber",nullable = false)
	private Long cardNumber;
	@Column(name="payment_amount",nullable = false)
	private double amount;
	@Column(name="payment_date")
	@Temporal(TemporalType.DATE)
	private Date date=new Date(System.currentTimeMillis());
	@Column(name="payment_time")
	@Temporal(TemporalType.TIME)
	private Date time=new  Date(System.currentTimeMillis());
	@Column(name="vegetableOrderId")
	private Long vegetableOrderId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="paymentDetailId")
	 private PaymentDetails paymentDetails;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(Long transactionId, int cvvNumber, Long cardNumber, double amount, Date date, Date time,
			Long vegetableOrderId, PaymentDetails paymentDetails) {
		super();
		this.transactionId = transactionId;
		this.cvvNumber = cvvNumber;
		this.cardNumber = cardNumber;
		this.amount = amount;
		this.date = date;
		this.time = time;
		this.vegetableOrderId = vegetableOrderId;
		this.paymentDetails = paymentDetails;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public int getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Long getVegetableOrderId() {
		return vegetableOrderId;
	}

	public void setFoodOrderId(Long vegetableOrderId) {
		this.vegetableOrderId = vegetableOrderId;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", cvvNumber=" + cvvNumber + ", cardNumber=" + cardNumber
				+ ", amount=" + amount + ", date=" + date + ", time=" + time + ", vegetableOrderId=" + vegetableOrderId
				+ ", paymentDetails=" + paymentDetails + "]";
	}
	

}
