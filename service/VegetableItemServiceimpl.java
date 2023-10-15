package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nineleaps.vegetablestoresystem.entity.VegetableItem;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.repository.VegetableItemRepository;

@Service
public class VegetableItemServiceimpl implements IVegetableItemService {
    
	@Autowired
	private VegetableItemRepository vegetableItemRepository;
	@Override
	public List<VegetableItem> getAllVegetableItem() {
		// TODO Auto-generated method stub
		return vegetableItemRepository.findAll();
	}

	@Override
	public VegetableItem saveVegetableItem(VegetableItem vegetableItem) {
		// TODO Auto-generated method stub
		return vegetableItemRepository.save(vegetableItem);
	}

	@Override
	public VegetableItem updateVegetableItem(VegetableItem vegetableItem) throws SourceNotFoundException {
		// TODO Auto-generated method stub
		return vegetableItemRepository.save(vegetableItem);
	}

	@Override
	public Optional<VegetableItem> getVegetableItemById(Long vegetableItemId) {
		// TODO Auto-generated method stub
		return vegetableItemRepository.findById(vegetableItemId);
	}

	@Override
	public void deleteVegetableItemById(Long vegetableItemId) {
		// TODO Auto-generated method stub
		vegetableItemRepository.deleteById(vegetableItemId);
		
	}

	@Override
	public List<VegetableItem> getVegetableItemByVegetableName(String vegetableItemName) {
		// TODO Auto-generated method stub
		return vegetableItemRepository.findByVegeatbleItemName(vegetableItemName);
	}

}
