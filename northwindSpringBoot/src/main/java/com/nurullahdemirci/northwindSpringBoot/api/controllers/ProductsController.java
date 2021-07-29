package com.nurullahdemirci.northwindSpringBoot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nurullahdemirci.northwindSpringBoot.business.abstracts.ProductService;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.DataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.Result;
import com.nurullahdemirci.northwindSpringBoot.entities.concretes.Product;
import com.nurullahdemirci.northwindSpringBoot.entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getById")
	public DataResult<Product> getById(@RequestParam Integer id){
		return this.productService.getById(id);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName, @RequestParam Integer categoryId){
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByProductNameOrCategoryId")
	public DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") Integer categoryId){
		return this.productService.getByProductNameOrCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getByCategoryIdIn")
	DataResult<List<Product>> getByCategoryIdIn(@RequestParam List<Integer> categories){
		return this.productService.getByCategoryIdIn(categories);
	}
	
	@GetMapping("/getByProductNameContains")
	DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("/getByProductNameStartsWith")
	DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String productName){
		return this.productService.getByProductNameStartsWith(productName);
	}
	
	@GetMapping("/getByNameCategoryId")
	DataResult<List<Product>> getByNameCategoryId(@RequestParam String productName, @RequestParam Integer categoryId){
		return this.productService.getByNameCategoryId(productName, categoryId);
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(@RequestParam Integer pageNo, @RequestParam Integer pageSize){
		return this.productService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();
	}
	
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	}
	
}
