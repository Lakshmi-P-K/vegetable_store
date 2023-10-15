package com.nineleaps.vegetablestoresystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.vegetablestoresystem.entity.PaymentDetails;

@Repository
public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails,Long> {

}
