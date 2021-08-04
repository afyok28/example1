package com.example.ogun.repository;

import java.util.List;
import com.example.ogun.model.User;

public interface UserRepository {
	public boolean add(User user);
	public User getMinMoney(int productId);
	public  List<User>  getAll();

}
