package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.vegetablestoresystem.entity.Placeorder;
import com.nineleaps.vegetablestoresystem.repository.PlaceorderRepository;



@Service
public class PlaceorderServiceimpl implements IPlaceorderService {
	@Autowired
	private PlaceorderRepository placeorderRepository;

	@Override
	public List<Placeorder> getAllPlaceorder() {
		// TODO Auto-generated method stub
		return placeorderRepository.findAll();
	}

	@Override
	public Placeorder saveBill(Placeorder placeorder) {
		// TODO Auto-generated method stub
		return placeorderRepository.save(placeorder);
	}

	@Override
	public Optional<Placeorder> getPlaceOrderById(Long placeOrderId) {
		// TODO Auto-generated method stub
		return placeorderRepository.findById(placeOrderId);
	}

	@Override
	public Placeorder updatePlaceorder(Placeorder placeOrder) {
		// TODO Auto-generated method stub
		return placeorderRepository.save(placeOrder);
	}

	@Override
	public void deleteBillById(Long placeOrderId) {
		// TODO Auto-generated method stub
		placeorderRepository.deleteById(placeOrderId);
		
	}

}
