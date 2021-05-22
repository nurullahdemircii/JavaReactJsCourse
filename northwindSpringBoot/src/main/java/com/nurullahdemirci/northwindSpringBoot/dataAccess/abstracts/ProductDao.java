package com.nurullahdemirci.northwindSpringBoot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nurullahdemirci.northwindSpringBoot.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	
	
}
