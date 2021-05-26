package com.nurullahdemirci.northwindSpringBoot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nurullahdemirci.northwindSpringBoot.business.abstracts.ProductService;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.DataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.Result;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.SuccessDataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi.");
	}

}
