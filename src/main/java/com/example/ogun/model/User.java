package com.example.ogun.model;

import com.example.ogun.repository.UserRepositoryImpl;

public class User {
	private int id;
	private int money;
	private String phoneNumber;
	private int productId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public User(int money, String phoneNumber, int productId) {
		super();
		this.id=UserRepositoryImpl.getUsers().size();
		this.money = money;
		this.phoneNumber = phoneNumber;
		this.productId = productId;
	}
	public User() {
		this.id=UserRepositoryImpl.getUsers().size()+1;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", money=" + money + ", phoneNumber=" + phoneNumber + ", productId=" + productId
				+ "]";
	}


	
}
