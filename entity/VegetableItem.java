package com.nineleaps.vegetablestoresystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "vegetable_item")
public class VegetableItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vegetable_id")
	  private Long vegetableItemId;
	@Column(name = "vegetable_item_name", nullable = false)
	private String vegeatbleItemName;
	@Column(name = "vegeatble_item_type",nullable = false)
	private String vegeatbleItemType;
	@Column(name = "vegeatble_item_category",nullable = false)
	private String vegetableItemCategory;
	@Column(name = "vegetable_item_price",nullable = false)
	private Integer vegeatbleItemPrice;
	
	@Column(name="shop_id")
	private Long shopId;
	
	
	public VegetableItem() {
		// TODO Auto-generated constructor stub
	}


	public VegetableItem(Long vegetableItemId, String vegeatbleItemName, String vegeatbleItemType,
			String vegetableItemCategory, Integer vegeatbleItemPrice, Long shopId) {
		super();
		this.vegetableItemId = vegetableItemId;
		this.vegeatbleItemName = vegeatbleItemName;
		this.vegeatbleItemType = vegeatbleItemType;
		this.vegetableItemCategory = vegetableItemCategory;
		this.vegeatbleItemPrice = vegeatbleItemPrice;
		this.shopId = shopId;
	}


	public Long getVegetableItemId() {
		return vegetableItemId;
	}


	public void setVegetableItemId(Long vegetableItemId) {
		this.vegetableItemId = vegetableItemId;
	}


	public String getVegeatbleItemName() {
		return vegeatbleItemName;
	}


	public void setVegeatbleItemName(String vegeatbleItemName) {
		this.vegeatbleItemName = vegeatbleItemName;
	}


	public String getVegeatbleItemType() {
		return vegeatbleItemType;
	}


	public void setVegeatbleItemType(String vegeatbleItemType) {
		this.vegeatbleItemType = vegeatbleItemType;
	}


	public String getVegetableItemCategory() {
		return vegetableItemCategory;
	}


	public void setVegetableItemCategory(String vegetableItemCategory) {
		this.vegetableItemCategory = vegetableItemCategory;
	}


	public Integer getVegeatbleItemPrice() {
		return vegeatbleItemPrice;
	}


	public void setVegeatbleItemPrice(Integer vegeatbleItemPrice) {
		this.vegeatbleItemPrice = vegeatbleItemPrice;
	}


	public Long getShopId() {
		return shopId;
	}


	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}


	@Override
	public String toString() {
		return "VegetableItem [vegetableItemId=" + vegetableItemId + ", vegeatbleItemName=" + vegeatbleItemName
				+ ", vegeatbleItemType=" + vegeatbleItemType + ", vegetableItemCategory=" + vegetableItemCategory
				+ ", vegeatbleItemPrice=" + vegeatbleItemPrice + ", shopId=" + shopId + "]";
	}

	
}
