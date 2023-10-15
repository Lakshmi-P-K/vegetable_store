package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.OrderDetail;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;



public interface IOrderDetailService {
	public List<OrderDetail> getAllOrders();
	public OrderDetail saveOrder(OrderDetail order);
	public OrderDetail updateOrder( OrderDetail order) throws SourceNotFoundException;
	public Optional<OrderDetail> getOrderById(Long orderId);
	public void deleteOrderById(Long orderId);

}
