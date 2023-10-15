package com.nineleaps.vegetablestoresystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.vegetablestoresystem.entity.Placeorder;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.service.IPlaceorderService;



@CrossOrigin("*")
@RestController
@RequestMapping
public class PlaceorderController {
	@Autowired
	private IPlaceorderService placeOrderService;
	
	@GetMapping("/listplaceorder")
	public List<Placeorder> getAllPlaceorder(){
		return placeOrderService.getAllPlaceorder();
	}
	
	@PostMapping("/savePlaceorder")
	public Placeorder savePlaceOrder(@RequestBody Placeorder placeorder) {
		return placeOrderService.saveBill(placeorder);
	}
	
	@PutMapping("/updateplaceorder/{pOrder_id}")
	public Placeorder updatePlaceOrder(@RequestBody Placeorder newPlaceOrder,@PathVariable("pOrder_id") Long placeOrderId) throws SourceNotFoundException {
		Placeorder placeOrder =  placeOrderService.getPlaceOrderById(placeOrderId)
				.orElseThrow(() -> new SourceNotFoundException("place order not exists with id" +placeOrderId));

		placeOrder.setStatus(newPlaceOrder.getStatus());
		placeOrder.setVegetableOrder(newPlaceOrder.getVegetableOrder());
		
		return placeOrderService.updatePlaceorder(placeOrder);
		
	}
	
	@GetMapping("/findplaceorder/{pOrder_id}")
	public Placeorder getPlaceOrderById(@PathVariable("pOrder_id") Long placeOrderId){
		return placeOrderService.getPlaceOrderById(placeOrderId).get();
	}
	
	@DeleteMapping("/deleteplaceorder/{pOrder_id}")
	public void deletePlaceOrderById(@PathVariable("pOrder_id") Long placeOrderId){
		placeOrderService.deleteBillById(placeOrderId);
	}
	

}
