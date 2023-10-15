package com.nineleaps.vegetablestoresystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.vegetablestoresystem.entity.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Long>  {

}
