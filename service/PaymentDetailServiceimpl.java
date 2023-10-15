package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.vegetablestoresystem.entity.PaymentDetails;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.repository.PaymentDetailsRepository;





@Service
public class PaymentDetailServiceimpl implements IPaymentDetailsService{

	@Autowired
	private PaymentDetailsRepository paymentdetailrepository;
	@Override
	public List<PaymentDetails> getAllPaymentDetails() {
		// TODO Auto-generated method stub
		return paymentdetailrepository.findAll();
	}

	@Override
	public PaymentDetails savePaymentDetail(PaymentDetails paymentdetails) {
		// TODO Auto-generated method stub
		return paymentdetailrepository.save(paymentdetails);
	}

	@Override
	public PaymentDetails updatePaymentDetail(PaymentDetails paymentdetails) throws SourceNotFoundException {
		// TODO Auto-generated method stub
		return paymentdetailrepository.save(paymentdetails);
	}

	@Override
	public Optional<PaymentDetails> getPaymentdetailsById(Long paymentDetailId) {
		// TODO Auto-generated method stub
		return paymentdetailrepository.findById(paymentDetailId);
	}

	@Override
	public void deletePaymentdetailsById(Long paymentDetailId) {
		paymentdetailrepository.deleteById(paymentDetailId);
		
	}

}
