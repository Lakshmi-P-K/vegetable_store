package com.nineleaps.vegetablestoresystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.nineleaps.vegetablestoresystem.entity.VegetableItem;



@Repository
public interface VegetableItemRepository extends JpaRepository<VegetableItem,Long> {
	List<VegetableItem> findByVegeatbleItemName(String vegetableItemName);
}
