package com.nurullahdemirci.northwindSpringBoot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nurullahdemirci.northwindSpringBoot.business.abstracts.ProductService;
import com.nurullahdemirci.northwindSpringBoot.dataAccess.abstracts.ProductDao;
import com.nurullahdemirci.northwindSpringBoot.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
