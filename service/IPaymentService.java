package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.Payment;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;



public interface IPaymentService {
	public List<Payment> getAllPayment();
	public Payment savePayment(Payment payment);
	public Payment updatePayment(Payment payment)throws SourceNotFoundException;
	public Optional<Payment> getTransactionById(Long transactionId);
	public void deleteTransactionById(Long transactionId);

}
