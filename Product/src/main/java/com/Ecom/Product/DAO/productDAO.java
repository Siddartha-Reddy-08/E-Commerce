package com.Ecom.Product.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ecom.Product.Model.productModel;

@Repository
public interface productDAO extends JpaRepository<productModel, Integer>{

}
