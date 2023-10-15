package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.VegetableItem;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;



public interface IVegetableItemService {
	public List<VegetableItem> getAllVegetableItem();
	public VegetableItem saveVegetableItem(VegetableItem vegetableItem);
	public VegetableItem updateVegetableItem(VegetableItem vegetableItem) throws SourceNotFoundException;
	public Optional<VegetableItem> getVegetableItemById(Long vegetableItemId);
	public void deleteVegetableItemById(Long vegetableItemId);
	public List<VegetableItem> getVegetableItemByVegetableName(String vegetableItemName);

}
