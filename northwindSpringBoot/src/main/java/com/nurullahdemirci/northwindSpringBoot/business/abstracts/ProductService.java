package com.nurullahdemirci.northwindSpringBoot.business.abstracts;

import java.util.List;

import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.DataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.Result;
import com.nurullahdemirci.northwindSpringBoot.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	
	DataResult<List<Product>> getAll(Integer pageNo, Integer pageSize);
	
	DataResult<List<Product>> getAllSorted();
	
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, Integer categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, Integer categoryId);
	
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameCategoryId(String productName, Integer categoryId);
	
}
