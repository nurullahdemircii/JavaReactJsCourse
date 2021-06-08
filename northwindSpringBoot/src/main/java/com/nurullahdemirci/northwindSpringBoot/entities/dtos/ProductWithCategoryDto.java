package com.nurullahdemirci.northwindSpringBoot.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {

	private Integer id;
	private String productName;
	private String categoryName;
	
}
