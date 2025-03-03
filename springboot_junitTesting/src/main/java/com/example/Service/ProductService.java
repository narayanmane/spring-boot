package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
	private ProductRepo productRepo;
	public Product addproduct(Product product) {
		
	boolean vali=	validationname(product.getName());
	if(vali) {
		return productRepo.save(product);
	}
	else {
		throw new RuntimeException("invaid name ");
	}
		
	}

	
	public void deleteproduct(int id) {
		productRepo.deleteById(id);
	}
	
	
	private boolean validationname(String name) {
		return name != null && !name.isEmpty();
	}
}
