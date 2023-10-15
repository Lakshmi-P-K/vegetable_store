package com.nineleaps.vegetablestoresystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.vegetablestoresystem.entity.PaymentDetails;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.service.IPaymentDetailsService;



@RestController
@RequestMapping("/paymentdetail")
public class PaymentDetailsController {
	@Autowired
	private IPaymentDetailsService paydetailservice;
	
	@GetMapping("/listpaymentdetail")
	public List<PaymentDetails> getAllPaymentDetail() {
		return paydetailservice.getAllPaymentDetails();
	}
	
	@PostMapping("/savepaymentdetail")
	public PaymentDetails savePaymentDetail(@RequestBody PaymentDetails paymentdetail) {
		return paydetailservice.savePaymentDetail(paymentdetail);
	}
	
	
	@PutMapping("/updatepaymentdetail/{pdid}")
	public PaymentDetails updatePaymentDetail(@RequestBody PaymentDetails newPaymentDetail,@PathVariable("pdid")Long paymentDetailId)throws SourceNotFoundException{
		PaymentDetails paydetail=paydetailservice.getPaymentdetailsById(paymentDetailId)
				.orElseThrow(() -> new SourceNotFoundException("Payment Detail does not exists with the given paymentDetailId  " +paymentDetailId));
		paydetail.setStatus(newPaymentDetail.getStatus());
		return paydetailservice.updatePaymentDetail(paydetail);
	}
	
	
	@GetMapping("/findpaymentdetail/{pdid}")
	public PaymentDetails getPaymentdetailById(@PathVariable("pdid")Long paymentDetailId) {
		return paydetailservice.getPaymentdetailsById(paymentDetailId).get();
	}
	
	@DeleteMapping("/deletepaymentdetail/{pdid}")
	public void  deletePaymentdetailById(@PathVariable("pdid")Long paymentDetailId) {
		paydetailservice.deletePaymentdetailsById(paymentDetailId);
	}
}


