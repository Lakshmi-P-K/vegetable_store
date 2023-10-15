package com.nineleaps.vegetablestoresystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.nineleaps.vegetablestoresystem.entity.OrderDetail;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {

}
