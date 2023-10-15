package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nineleaps.vegetablestoresystem.entity.Payment;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.repository.PaymentRepository;

@Service
public class PaymentServiceimpl implements IPaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

	@Override
	public Payment savePayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentRepository.save(payment);
	}

	@Override
	public Payment updatePayment(Payment payment) throws SourceNotFoundException {
		// TODO Auto-generated method stub
		return paymentRepository.save(payment);
	}

	@Override
	public Optional<Payment> getTransactionById(Long transactionId) {
		// TODO Auto-generated method stub
		return paymentRepository.findById(transactionId);
	}

	@Override
	public void deleteTransactionById(Long transactionId) {
		// TODO Auto-generated method stub
		paymentRepository.findById(transactionId);
		
	}

}
