package com.ecom.product.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.product.model.product;



@Repository
public interface productDao extends JpaRepository<product, Integer>{
	

	
		
	}


