package com.fashionsuperior.models;

import org.springframework.beans.BeanUtils;

import com.fashionsuperior.entities.Product;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class ProductResponseDto {

	private String brand;
	
	private int productId;
	
	private String pname;
	
	private String categoryName;
	
	private double price;
	
	private int sellerId;
	
	private String colour;
	
	private String sellerName;
	
	private String photo;
	
	public static ProductResponseDto fromEntity(Product entity) {
		ProductResponseDto dto = new ProductResponseDto();
		dto.setSellerId(entity.getSeller().getId());
		dto.setSellerName(entity.getSeller().getName());
		dto.setCategoryName(entity.getCategory().getCategoryName());
		dto.setColour(entity.getColour());
		BeanUtils.copyProperties(entity, dto);	
		return dto;
	}
}
