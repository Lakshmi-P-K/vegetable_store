package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.PaymentDetails;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;



public interface IPaymentDetailsService {
	public List<PaymentDetails> getAllPaymentDetails();
	public PaymentDetails savePaymentDetail(PaymentDetails paymentdetails);
	public PaymentDetails updatePaymentDetail(PaymentDetails paymentdetails)throws SourceNotFoundException;
	public Optional<PaymentDetails> getPaymentdetailsById(Long paymentDetailId);
	public void  deletePaymentdetailsById(Long paymentDetailId);

}
