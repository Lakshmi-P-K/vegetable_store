package com.nineleaps.vegetablestoresystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_detail")
public class PaymentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="paymentDetailId")
	private Long paymentDetailId;
	@Column(name="paymentDetail_status",nullable = false)
	private String status;
	
	public PaymentDetails() {
		// TODO Auto-generated constructor stub
	}

	public PaymentDetails(Long paymentDetailId, String status) {
		super();
		this.paymentDetailId = paymentDetailId;
		this.status = status;
	}

	public Long getPaymentDetailId() {
		return paymentDetailId;
	}

	public void setPaymentDetailId(Long paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PaymentDetails [paymentDetailId=" + paymentDetailId + ", status=" + status + "]";
	}
	

}
