package com.nineleaps.vegetablestoresystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.vegetablestoresystem.entity.Placeorder;



@Repository
public interface PlaceorderRepository extends JpaRepository<Placeorder,Long> {

}
