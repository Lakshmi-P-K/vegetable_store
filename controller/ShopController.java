package com.nineleaps.vegetablestoresystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.vegetablestoresystem.entity.Shop;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.service.IShopService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin("*")
@RestController
@RequestMapping("/shop")
public class ShopController {
	@Autowired
	private IShopService shopService;
	
	@GetMapping("/listShop")
	public List<Shop> getAllShop(){
 return shopService.getAllShop();
	}
	
	@PostMapping("/saveshop")
	public Shop saveRestraunt(@RequestBody Shop shop) {
 return shopService.saveShop(shop);
	}
	
	@PutMapping("/updateRestraunt/{sid}")
	public Shop updateShop(@RequestBody Shop newShop,@PathVariable("sid")Long shopId) throws SourceNotFoundException {
 Shop sp =shopService.getShopById(shopId)
 .orElseThrow(() -> new SourceNotFoundException("Shop does not exists with the given Shop Id" +shopId));
 sp.setOwnerName(newShop.getOwnerName());
 sp.setShopPhoneNumber(newShop.getShopPhoneNumber());
 sp.setShopEmail(newShop.getShopEmail());
 
 sp.setShopCity(newShop.getShopCity());
 sp.setShopCountry(newShop.getShopCountry());
 sp.setShopName(newShop.getShopName());
 sp.setUsername(newShop.getUsername());
 sp.setPassword(newShop.getPassword());
 return shopService.updateShop(sp);
	}
	
	
	@GetMapping("/findShop/{sid}")
	public Shop getShopById(@PathVariable("sid")Long shopId) {
 return shopService.getShopById(shopId).get();
	}
	
	@DeleteMapping("/deleteRestraunt/{sid}")
	public void deleteRestrauntById(@PathVariable("sid")Long shopId) {
 shopService.deleteShopById(shopId);
	}
	
	@GetMapping("/findshopbyname/{shopname}")
	public List<Shop> getShopByShopName(@PathVariable("shopname") String shopName) {
 return shopService.getShopByShopName(shopName);
	}
	
}


