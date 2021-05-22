package com.nurullahdemirci.northwindSpringBoot.business.abstracts;

import java.util.List;

import com.nurullahdemirci.northwindSpringBoot.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
