package com.nineleaps.vegetablestoresystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "shop")
public class Shop {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="shop_id", nullable = false)
	  private Long shopId;
	  @NotEmpty
	  @Size(min=2,message="Name should have atleast 2 charecters")
	  @Column(name = "owner_name")
	  private String ownerName;
	  
	  @NotEmpty
	  @Column(name = "shop_phonenumber")
	  private String shopPhoneNumber;
	  @NotEmpty
	  @Email
	  @Column(name = "shop_email")
	  private String shopEmail;
	  private String shopCity;
	  @NotEmpty
	  @Size(min=2,message="country name should have atleast 2 charecters")
	  @Column(name = "shop_country")
	  private String shopCountry;
	  @NotEmpty
	  @Size(min=2,message="shop name should have atleast 2 charecters")
	  @Column(name = "shop_name")
	  private String shopName;
	  
	 
	  
	  @Column(name = "username",nullable = false)
	  private String username;
	  @Column(name = "password",nullable = false)
	  private String password;
	  
	  public Shop() {
		super();
	}

	public Shop(@NotEmpty @Size(min = 2, message = "Name should have atleast 2 charecters") String ownerName,
			@NotEmpty String shopPhoneNumber, @NotEmpty @Email String shopEmail, String shopCity,
			@NotEmpty @Size(min = 2, message = "country name should have atleast 2 charecters") String shopCountry,
			@NotEmpty @Size(min = 2, message = "shop name should have atleast 2 charecters") String shopName,
			String username, String password) {
		super();
		this.ownerName = ownerName;
		this.shopPhoneNumber = shopPhoneNumber;
		this.shopEmail = shopEmail;
		this.shopCity = shopCity;
		this.shopCountry = shopCountry;
		this.shopName = shopName;
		this.username = username;
		this.password = password;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getShopPhoneNumber() {
		return shopPhoneNumber;
	}

	public void setShopPhoneNumber(String shopPhoneNumber) {
		this.shopPhoneNumber = shopPhoneNumber;
	}

	public String getShopEmail() {
		return shopEmail;
	}

	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}

	public String getShopCity() {
		return shopCity;
	}

	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	public String getShopCountry() {
		return shopCountry;
	}

	public void setShopCountry(String shopCountry) {
		this.shopCountry = shopCountry;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", ownerName=" + ownerName + ", shopPhoneNumber=" + shopPhoneNumber
				+ ", shopEmail=" + shopEmail + ", shopCity=" + shopCity + ", shopCountry=" + shopCountry + ", shopName="
				+ shopName + ", username=" + username + ", password=" + password + "]";
	}

	
}
