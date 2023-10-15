package com.nineleaps.vegetablestoresystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.vegetablestoresystem.entity.Bill;



@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

}
