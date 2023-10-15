package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.Shop;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;



public interface IShopService {
	public List<Shop> getAllShop();
	public Shop saveShop(Shop shop);
	public Shop updateShop(Shop shop)throws SourceNotFoundException;
	public Optional<Shop> getShopById(Long shopId);
	public void deleteShopById(Long shopId);
	public List<Shop> getShopByShopName(String shopName);

}
