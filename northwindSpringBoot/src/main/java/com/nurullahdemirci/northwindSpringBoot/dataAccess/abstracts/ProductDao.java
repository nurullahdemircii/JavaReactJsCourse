package com.nurullahdemirci.northwindSpringBoot.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nurullahdemirci.northwindSpringBoot.entities.concretes.Product;
import com.nurullahdemirci.northwindSpringBoot.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, Integer categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, Integer categoryId);
	
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
//	JPQL
//	@Query("From Product Where entitiesParameter=:functionParameter")
//	List<entitiesClass> getByMyNameValue(String functionParameter);
	@Query("From Product Where productName=:productName And category.categoryId=:categoryId")
	List<Product> getByNameCategory_CategoryId(String productName, Integer categoryId);
	
//	select p.productId, p.productName, c.categoryName from Category c inner join Product p
//	on c.categoryId = p.categoryId;	
	@Query("Select new com.nurullahdemirci.northwindSpringBoot.entities.dtos.ProductWithCategoryDto"
			+ "(p.id, p.productName, c.categoryName)"
			+ "From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();

}
