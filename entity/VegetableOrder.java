package com.nineleaps.vegetablestoresystem.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "vegetableorder")
public class VegetableOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vegetableorderId")
	private Long vegetableOrderId;
	@Column(name = "customer_id")
	private Long customerId;
	@Column(name = "vegeatble_quantity")
	private int quantity;
	
	
	@Column(name = "vegetblePrice")
//	@Formula(("food_quantity*(select food_item_price from food_item f where f.id = foodorder_fkid)"))
	private double vegetablePrice;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="vegetableItem_fkid" ,referencedColumnName = "vegetableOrderId")
	private List<VegetableItem> vegetableItem=new ArrayList<>();
	
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vegetableOrderId")
	private OrderDetail orderEntity;
	public VegetableOrder() {
		// TODO Auto-generated constructor stub
	}
	public VegetableOrder(Long vegetableOrderId, Long customerId, int quantity, Date orderDate, Date orderTime,
			double vegetablePrice, List<VegetableItem> vegetableItem, OrderDetail orderEntity) {
		super();
		this.vegetableOrderId = vegetableOrderId;
		this.customerId = customerId;
		this.quantity = quantity;
		/*this.orderDate = orderDate;
		this.orderTime = orderTime; */
		this.vegetablePrice = vegetablePrice;
		this.vegetableItem = vegetableItem;
		this.orderEntity = orderEntity;
	}
	public Long getVegetableOrderId() {
		return vegetableOrderId;
	}
	public void setVegetableOrderId(Long vegetableOrderId) {
		this.vegetableOrderId = vegetableOrderId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/*public Date getOrderDate() {
		return OrderDate;
	}
	 public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime; */
	
	public double getVegetablePrice() {
		return vegetablePrice;
	}
	public void setVegetablePrice(double vegetablePrice) {
		this.vegetablePrice = vegetablePrice;
	}
	public List<VegetableItem> getVegetableItem() {
		return vegetableItem;
	}
	public void setVegetableItem(List<VegetableItem> vegetableItem) {
		this.vegetableItem = vegetableItem;
	}
	public OrderDetail getOrderEntity() {
		return orderEntity;
	}
	public void setOrderEntity(OrderDetail orderEntity) {
		this.orderEntity = orderEntity;
	}
	@Override
	public String toString() {
		return "VegetableOrder [vegetableOrderId=" + vegetableOrderId + ", customerId=" + customerId + ", quantity="
				+ quantity + ", orderDate=" + /*orderDate + ", orderTime=" + orderTime + */", vegetablePrice="
				+ vegetablePrice + ", vegetableItem=" + vegetableItem + ", orderEntity=" + orderEntity + "]";
	}
	

	
}
