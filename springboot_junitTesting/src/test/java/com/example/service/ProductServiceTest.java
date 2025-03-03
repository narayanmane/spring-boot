package com.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.Service.ProductService;
import com.example.entity.Product;
import com.example.repo.ProductRepo;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
	@InjectMocks
	ProductService productService;
	
	@Mock
	ProductRepo productRepo;
	@BeforeAll
	public static void inti()
	{
		System.out.println("before call");
	}
	
	@BeforeEach
	public  void intibeforeeach()
	{
		System.out.println("before each call");
	}
	@Test
	public void  addproduct() {
		System.out.println("first test");
		Product product = new Product();
		product.setId(1);
		product.setName("notebookt");
		product.setType("book");
		
	Mockito.when(productRepo.save(product)).thenReturn(product);
	Product addproduct	=productService.addproduct(product);
	
	//test product ==matched product 
	Assertions.assertEquals(1, addproduct.getId());
	//Assertions.assertNull(addproduct);
	//Assertions.assertEquals(product.getName(), addproduct.getName());
}
    @Test	
	public void dummy() {
		System.out.println("dummy method call");
	}
    
    @AfterAll
    public static void destroy() {
    	System.out.println("after All");
    }
    
    @AfterEach
    public void destroy1() {
    	System.out.println("after Each");
    }
    
    
    @Test
    public void deleteproductbytest()
    {   doNothing().when(productRepo).deleteById(1);
    	productService.deleteproduct(1);
    	Mockito.verify(productRepo, times(1)).deleteById(1);;
    }
    
    @Test
    public void validationname_test() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    Method valMethod	=ProductService.class.getDeclaredMethod("validationname",String.class);
  
    valMethod.setAccessible(true); // set accessible of private method 
    Boolean Book =(Boolean) valMethod.invoke(productService, "Book");
    assertTrue(Book);
    	
    }
    
    
    @Test
    public void validationname_testifnameinvalid() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    Method valMethod	=ProductService.class.getDeclaredMethod("validationname",String.class);
  
    valMethod.setAccessible(true); // set accessible of private method 
    Boolean Book =(Boolean) valMethod.invoke(productService, "");
    assertFalse(Book);
    	
    }
    
    
    @Test
	public void  addproductThrowExpectionalforInvalidProductName() {
		System.out.println("first test");
		Product product = new Product();
		product.setId(1);
		product.setName("");
		product.setType("book");
		
	   
	  RuntimeException runtimeException =assertThrows(RuntimeException.class, ()->{
		   productService.addproduct(product);
	   });
	  
	  assertEquals("invalid Name of product ", runtimeException.getMessage());
	
	
}
    
}
