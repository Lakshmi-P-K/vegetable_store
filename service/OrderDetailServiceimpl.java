package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nineleaps.vegetablestoresystem.entity.OrderDetail;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.repository.OrderDetailRepository;

@Service
public class OrderDetailServiceimpl implements IOrderDetailService {
	@Autowired
	private OrderDetailRepository orderRepository;
	@Override
	public List<OrderDetail> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public OrderDetail saveOrder(OrderDetail order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public OrderDetail updateOrder(OrderDetail order) throws SourceNotFoundException {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public Optional<OrderDetail> getOrderById(Long orderId) {
		// TODO Auto-generated method stub
		return orderRepository.findById(orderId);
	}

	@Override
	public void deleteOrderById(Long orderId) {
		// TODO Auto-generated method stub
		orderRepository.deleteById(orderId);
		
	}
	

}
