package com.example.ogun.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.example.ogun.model.User;

public class UserRepositoryImpl implements UserRepository{

	private final static List<User> users=new ArrayList<User>();
	
	public static List<User> getUsers() {
		return users;
	}
	@Override
	public boolean add(User user) {
		try {
			users.add(user);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	@Override
	public User getMinMoney(int productId) {
		List<User> temp=new ArrayList<User>();
		for (User user : users) {
			if(user.getProductId()==productId)
				temp.add(user);
		}
		try {
			temp.sort(Comparator.comparing(User::getMoney));
			return temp.get(0);
		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
