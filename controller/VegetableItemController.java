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

import com.nineleaps.vegetablestoresystem.entity.VegetableItem;
import com.nineleaps.vegetablestoresystem.exception.SourceNotFoundException;
import com.nineleaps.vegetablestoresystem.service.IVegetableItemService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin("*")
@RequestMapping("/vegetableitem")
@RestController
public class VegetableItemController {
	@Autowired
	private IVegetableItemService vegetableItemService;
	
	@GetMapping("/listvegetableitem")
	public List<VegetableItem> getAllVegetableItem(){
 return vegetableItemService.getAllVegetableItem();
	}
	
	@PostMapping("/savevegetableitem")
	public VegetableItem saveVegetableItem(@RequestBody VegetableItem vegetableItem) {
 return vegetableItemService.saveVegetableItem(vegetableItem);
	}
	@PutMapping("/updatevegetableitem/{pid}")
	public VegetableItem updateVegetableItem(@RequestBody VegetableItem newvegetableItem,@PathVariable("pid") Long vegetableItemId) throws SourceNotFoundException{
 VegetableItem vegetableItem = vegetableItemService.getVegetableItemById(vegetableItemId).orElseThrow(() -> new SourceNotFoundException("vegetableItem not exists with Id" + vegetableItemId));
 vegetableItem.setVegeatbleItemName(newvegetableItem.getVegeatbleItemName());
 vegetableItem.setVegeatbleItemPrice(newvegetableItem.getVegeatbleItemPrice());
 vegetableItem.setVegeatbleItemType(newvegetableItem.getVegeatbleItemType());
 vegetableItem.setVegetableItemCategory(newvegetableItem.getVegetableItemCategory());
 return vegetableItemService.updateVegetableItem(vegetableItem);
 }
	@GetMapping("/findvegetableitem/{vid}")
	public VegetableItem getVegetableItemById(@PathVariable("vid") Long vegetableItemId){
 return vegetableItemService.getVegetableItemById(vegetableItemId).get();
	}
	@DeleteMapping("/deletevegetableitem/{pid}")
	public void deleteVegetableItemById(@PathVariable("pid") Long vegetableItemId){
 vegetableItemService.deleteVegetableItemById(vegetableItemId);
	}
	
	@GetMapping("/findvegetablename/{vegetablename}")
	public List<VegetableItem> getVegetableItemByVegetableName(@PathVariable("vegetablename") String vegetableItemName) {
 return vegetableItemService.getVegetableItemByVegetableName(vegetableItemName);
	}

}
