package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nineleaps.vegetablestoresystem.entity.VegetableOrder;
import com.nineleaps.vegetablestoresystem.repository.VegetableOrderRepository;

@Service
public class VegetableOrderServiceimpl implements IVegetableOrderService{
	@Autowired
	private VegetableOrderRepository vegetableOrderRepository;
	@Override
	public List<VegetableOrder> getAllVegetableOrder() {
		// TODO Auto-generated method stub
		return vegetableOrderRepository.findAll();
	}

	@Override
	public VegetableOrder saveVegetableOrder(@Valid VegetableOrder vegetableOrder) {
		// TODO Auto-generated method stub
		return vegetableOrderRepository.save(vegetableOrder);
	}

	@Override
	public Optional<VegetableOrder> getVegetableOrderById(Long vegetableOrderId) {
		// TODO Auto-generated method stub
		return vegetableOrderRepository.findById(vegetableOrderId);
	}

	@Override
	public VegetableOrder updateVegetableOrder(VegetableOrder vegetableOrder) {
		// TODO Auto-generated method stub
		return vegetableOrderRepository.save(vegetableOrder);
	}

	@Override
	public void deleteVegetableOrderById(Long vegetableOrderId) {
		// TODO Auto-generated method stub
		vegetableOrderRepository.deleteById(vegetableOrderId);
		
	}

}
