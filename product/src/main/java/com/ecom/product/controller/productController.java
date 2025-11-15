package com.ecom.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.product.model.product;
import com.ecom.product.service.productservice;

@RestController
@RequestMapping("/product")
public class productController {
	
	@Autowired
	productservice productservice;
	
	@PostMapping("/add")
	public void addProduct(@RequestBody product product) {
		  productservice.addProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteproduct(@RequestParam int id) {
		  productservice.deleteproduct(id);
	}

}
