package com.example.ogun.controller;

import com.example.ogun.model.User;

public interface UserService {

	public boolean add(User user);
	public User getMinMoney(int productId);
	public void print();


}
