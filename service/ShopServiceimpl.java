package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nineleaps.vegetablestoresystem.entity.Shop;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.repository.ShopRepository;

@Service
public class ShopServiceimpl implements IShopService {

	@Autowired
	private ShopRepository shopRepository;
	@Override
	public List<Shop> getAllShop() {
		// TODO Auto-generated method stub
		return shopRepository.findAll();
	}

	@Override
	public Shop saveShop(Shop shop) {
		// TODO Auto-generated method stub
		return shopRepository.save(shop);
	}

	@Override
	public Shop updateShop(Shop shop) throws SourceNotFoundException {
		// TODO Auto-generated method stub
		return shopRepository.save(shop);
	}

	@Override
	public Optional<Shop> getShopById(Long shopId) {
		// TODO Auto-generated method stub
		return shopRepository.findById(shopId);
	}

	@Override
	public void deleteShopById(Long shopId) {
		// TODO Auto-generated method stub
		shopRepository.deleteById(shopId);
		
	}

	@Override
	public List<Shop> getShopByShopName(String shopName) {
		// TODO Auto-generated method stub
		return shopRepository.findByshopName(shopName);
	}

}
