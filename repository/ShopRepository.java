package com.nineleaps.vegetablestoresystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.nineleaps.vegetablestoresystem.entity.Shop;



@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
	@Query
	public List<Shop> findByshopName(String shopName);
	

}
