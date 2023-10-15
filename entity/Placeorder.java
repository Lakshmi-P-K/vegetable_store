package com.nineleaps.vegetablestoresystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "place_order")
public class Placeorder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long placeOrderId;
	
	@Column(name = "status",nullable= false)
	private String status;
	
	/*@ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "shop_shopid")
	  private Shop shop; */
	 
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "veg_item_order_item_order_id")
	  private VegetableOrder vegetableOrder; 
	 
	/* @OneToMany(cascade = CascadeType.ALL, mappedBy = "Placeorder")
	    private List<VegetableOrder> vegetableOrder; */
	 
	 public Placeorder() {
		// TODO Auto-generated constructor stub
	}

	public Placeorder(Long placeOrderId, String status, Shop shop, VegetableOrder vegetableOrder) {
		super();
		this.placeOrderId = placeOrderId;
		this.status = status;
		/*this.shop = shop; */
		this.vegetableOrder = vegetableOrder; 
	}

	public Long getPlaceOrderId() {
		return placeOrderId;
	}

	public void setPlaceOrderId(Long placeOrderId) {
		this.placeOrderId = placeOrderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

 /*	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop; 
	} */

	public VegetableOrder getVegetableOrder() {
		return vegetableOrder;
	}

	public void setVegetableOrder(VegetableOrder vegetableOrder) {
		this.vegetableOrder = vegetableOrder; 
	}
	

	@Override
	public String toString() {
		return "Placeorder [placeOrderId=" + placeOrderId + ", status=" + status + ",vegetableOrder=+vegetableOrder]";
	}
	 

}
