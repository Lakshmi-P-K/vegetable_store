package com.nineleaps.vegetablestoresystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.vegetablestoresystem.entity.VegetableOrder;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.service.IVegetableOrderService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin("*")
@RestController
@RequestMapping("/vegetableorder")
public class VegetableOrderController {
	@Autowired
	private IVegetableOrderService vegetableOrderService;
	
	@GetMapping("/listvegetableorder")
	public List<VegetableOrder> getAllVegetableOrder(){
 return vegetableOrderService.getAllVegetableOrder();
	}
	
	@PostMapping("/savevegetableorder")
	public VegetableOrder saveVegetableOrder(@Valid @RequestBody VegetableOrder vegetableOrder) {
 return vegetableOrderService.saveVegetableOrder(vegetableOrder);
	}
	
	@PutMapping("/updatevegetableorder/{oid}")
	public VegetableOrder updateVegetableOrder(@Valid @RequestBody VegetableOrder newVegetableOrder,@PathVariable("oid")Long OrderId)throws SourceNotFoundException{
 VegetableOrder vtorder=vegetableOrderService.getVegetableOrderById(OrderId)
 .orElseThrow(() -> new SourceNotFoundException("Vegetable Order does not exists with the given order Id:" +OrderId));
 vtorder.setQuantity(newVegetableOrder.getQuantity());
 vtorder.setVegetablePrice(newVegetableOrder.getVegetablePrice());
 return vegetableOrderService.updateVegetableOrder(vtorder);
	}
	
	@GetMapping("/findvegetableorder/{oid}")
	public VegetableOrder getVegetableOrderById(@PathVariable("oid")Long OrderId) {
 return vegetableOrderService.getVegetableOrderById(OrderId).get();
	}
	
	@DeleteMapping("/deletevegetableorder/{oid}")
	public void deleteVegetableOrderById(@PathVariable("oid")Long OrderId)
	{
 vegetableOrderService.deleteVegetableOrderById(OrderId);
	}

}
