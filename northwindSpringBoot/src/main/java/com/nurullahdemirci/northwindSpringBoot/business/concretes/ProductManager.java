package com.nurullahdemirci.northwindSpringBoot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nurullahdemirci.northwindSpringBoot.business.abstracts.ProductService;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.DataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.Result;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.SuccessDataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.SuccessResult;
import com.nurullahdemirci.northwindSpringBoot.dataAccess.abstracts.ProductDao;
import com.nurullahdemirci.northwindSpringBoot.entities.concretes.Product;
import com.nurullahdemirci.northwindSpringBoot.entities.dtos.ProductWithCategoryDto;

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
	
//	Sayfalama
	@Override
	public DataResult<List<Product>> getAll(Integer pageNo, Integer pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());
	}
	
//	Sıralama
	@Override
	public DataResult<List<Product>> getAllSorted(){
		Sort sort = Sort.by(Sort.Direction.DESC, "productName");
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort));
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi.");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName), "Data Listelendi");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, Integer categoryId) {
		return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, Integer categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByCategory_CategoryIdIn(categories), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName), "Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByNameCategoryId(String productName, Integer categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByNameCategory_CategoryId(productName, categoryId), "Data Listelendi");
	}

	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		return new SuccessDataResult<List<ProductWithCategoryDto>>(
				this.productDao.getProductWithCategoryDetails(), "Data Listelendi");
	}

	@Override
	public DataResult<Product> getById(Integer id) {
		return new SuccessDataResult<Product>(this.productDao.getById(id), "Data Listed.");
	}

}
