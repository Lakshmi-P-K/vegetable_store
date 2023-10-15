package com.nineleaps.vegetablestoresystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.vegetablestoresystem.entity.Payment;



@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{
}



