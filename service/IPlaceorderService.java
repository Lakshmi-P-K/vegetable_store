package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.Placeorder;



public interface IPlaceorderService {
	public List<Placeorder> getAllPlaceorder();

	public Placeorder saveBill(Placeorder placeorder);

	public Optional<Placeorder> getPlaceOrderById(Long placeOrderId);

	public Placeorder updatePlaceorder(Placeorder placeOrder);

	public void deleteBillById(Long placeOrderId);

}
