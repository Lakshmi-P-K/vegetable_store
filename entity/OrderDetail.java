package com.nineleaps.vegetablestoresystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="order_detail")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long orderId;
		@Column(name = "product_quantity",nullable = false)
		private int productQuantity;
		@Column(name = "product_price",nullable = false)
		private int productPrice;
		@Column(name = "order_status",nullable = false)
		private String orderStatus;
		
		public OrderDetail() {
			// TODO Auto-generated constructor stub
		}

		public OrderDetail(Long orderId, int productQuantity, int productPrice, String orderStatus) {
			super();
			this.orderId = orderId;
			this.productQuantity = productQuantity;
			this.productPrice = productPrice;
			this.orderStatus = orderStatus;
		}

		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public int getProductQuantity() {
			return productQuantity;
		}

		public void setProductQuantity(int productQuantity) {
			this.productQuantity = productQuantity;
		}

		public int getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		@Override
		public String toString() {
			return "OrderDetail [orderId=" + orderId + ", productQuantity=" + productQuantity + ", productPrice="
					+ productPrice + ", orderStatus=" + orderStatus + "]";
		}
		

}
