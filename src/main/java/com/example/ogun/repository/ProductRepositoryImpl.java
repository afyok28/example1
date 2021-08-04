package com.example.ogun.repository;

import java.util.HashSet;
import java.util.Set;

import com.example.ogun.model.Product;

public class ProductRepositoryImpl implements ProductRepository{

	private final static Set<Product> PRODUCTS=new HashSet<Product>();
	
	public static Set<Product> getProducts() {
		return PRODUCTS;
	}

	@Override
	public Set<Product> getAll() {
		return PRODUCTS;
	}

	@Override
	public boolean isCreated(String str) {
		for(Product product:PRODUCTS)
			if(product.getName().equals(str))
				return true;
		return false;
	}

	@Override
	public Product get(String str) {
		for(Product product:PRODUCTS)
			if(product.getName().equals(str))
			{
				str=product.getName();
				break;
			}
		return new Product(str);
	}

	@Override
	public boolean add(Product product) {
		try {
			PRODUCTS.add(product);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int getIndex(Product temp) {
		int index=0;
		for(Product product:PRODUCTS)
		{
			if(product.getName().equals(temp.getName()))
			{
				return index;
				
			}
			index++;
		}
			
		return -1;
	}

	
}
