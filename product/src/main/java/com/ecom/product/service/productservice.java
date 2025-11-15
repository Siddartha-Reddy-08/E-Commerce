package com.ecom.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.product.dao.productDao;
import com.ecom.product.model.product;

@Service
public class productservice {

	
@Autowired
productDao productDao;

	public void addProduct(product product) {
		// TODO Auto-generated method stub
	   productDao.save(product);
		
	}

	public void deleteproduct(int id) {
		productDao.deleteById(id);
		
	}

}
