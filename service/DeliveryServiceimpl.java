package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nineleaps.vegetablestoresystem.entity.Delivery;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.repository.DeliveryRepository;
@Service
public class DeliveryServiceimpl implements IDeliveryService{
	@Autowired
	private DeliveryRepository deliveryRepository;
	@Override
	public List<Delivery> getAllDeliveries() {
		// TODO Auto-generated method stub
		return deliveryRepository.findAll();
	}

	@Override
	public Delivery saveDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		return deliveryRepository.save(delivery);
	}

	@Override
	public Delivery updateDelivery(Delivery delivery) throws SourceNotFoundException {
		// TODO Auto-generated method stub
		return deliveryRepository.save(delivery);
	}

	@Override
	public Optional<Delivery> getDeliveriesById(Long deliveryId) {
		// TODO Auto-generated method stub
		return deliveryRepository.findById(deliveryId);
	}

	@Override
	public void deleteDeliveriesById(Long deliveryId) {
		// TODO Auto-generated method stub
		deliveryRepository.deleteById(deliveryId);
		
	}

}
