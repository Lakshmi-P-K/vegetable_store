package com.nineleaps.vegetablestoresystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.vegetablestoresystem.entity.VegetableOrder;

@Repository
public interface VegetableOrderRepository extends JpaRepository<VegetableOrder,Long> {

}
