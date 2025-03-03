package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.ProductService;
import com.example.entity.Product;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
	private ProductService productService;
    
    @PostMapping
    public ResponseEntity<Product> saveproduct(@RequestBody Product product){
    	return ResponseEntity.ok(productService.addproduct(product));
    }
}
