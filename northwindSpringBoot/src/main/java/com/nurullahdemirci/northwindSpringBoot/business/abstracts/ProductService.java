package com.nurullahdemirci.northwindSpringBoot.business.abstracts;

import java.util.List;

import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.DataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.Result;
import com.nurullahdemirci.northwindSpringBoot.entities.concretes.Product;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	
	Result add(Product product);
}
