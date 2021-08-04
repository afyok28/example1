package com.example.ogun.controller;

import com.example.ogun.model.Product;
import com.example.ogun.repository.ProductRepository;
import com.example.ogun.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService{

	private  ProductRepository productRepository= new ProductRepositoryImpl();
	@Override
	public boolean add(Product product) {
		
		return productRepository.add(product);
	}
	@Override
	public void print() {
		for (Product product : productRepository.getAll()) {
			System.out.println(product);
		}
	}
	


}
