package com.example.ogun.repository;

import java.util.Set;

import com.example.ogun.model.Product;

public interface ProductRepository {
	
	public  Set<Product> getAll();
	public  boolean isCreated(String str);
	public  Product get(String str);
	public  boolean add(Product product);
	public int getIndex(Product product);

}
