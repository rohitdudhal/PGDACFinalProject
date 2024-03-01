package com.fashionsuperior.service;


import java.util.List;

import com.fashionsuperior.entities.Category;


public interface CategoryService {


	
	Category findByCategoryName(String categoryName);

	Category addCategory(Category category);

	List<Category> findAllCategory();

}
