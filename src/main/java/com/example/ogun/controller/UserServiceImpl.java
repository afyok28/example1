package com.example.ogun.controller;

import com.example.ogun.model.User;
import com.example.ogun.repository.UserRepository;
import com.example.ogun.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService{

	private final UserRepository userRepository= new UserRepositoryImpl();
	@Override
	public boolean add(User user) {
		try {
			userRepository.add(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public User getMinMoney(int productId) {
		
		return userRepository.getMinMoney(productId);
	}

	@Override
	public void print() {
		for (User product : userRepository.getAll()) {
			System.out.println(product);
		}
		
	}

}
