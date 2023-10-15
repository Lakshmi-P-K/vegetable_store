package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.nineleaps.vegetablestoresystem.entity.VegetableOrder;



public interface IVegetableOrderService {
	public List<VegetableOrder> getAllVegetableOrder();

	public VegetableOrder saveVegetableOrder(@Valid VegetableOrder foodOrder);

	public Optional<VegetableOrder> getVegetableOrderById(Long orderId);

	public VegetableOrder updateVegetableOrder(VegetableOrder fdorder);

	public void deleteVegetableOrderById(Long orderId);


}
