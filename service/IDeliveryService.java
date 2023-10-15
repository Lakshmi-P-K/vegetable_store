package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.Delivery;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;



public interface IDeliveryService {
	public List<Delivery> getAllDeliveries();
	public Delivery saveDelivery(Delivery delivery);
	public Delivery updateDelivery( Delivery delivery) throws SourceNotFoundException;
	public Optional<Delivery> getDeliveriesById(Long deliveryId);
	public void deleteDeliveriesById(Long deliveryId);

}
