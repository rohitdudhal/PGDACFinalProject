package com.fashionsuperior.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fashionsuperior.entities.Category;
import com.fashionsuperior.entities.Product;
import com.fashionsuperior.entities.Seller;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findBySeller(Seller seller);

	List<Product> findByCategory(Category category);

	@Query("SELECT p FROM Product p " 
+ "WHERE "
+ "p.category.categoryName = :category "
			+ "AND"
			+ " (p.price BETWEEN :minPrice AND :maxPrice) "
			+ "ORDER BY " + "CASE WHEN :sort = 'price_low' THEN p.price END ASC, "
			+ "CASE WHEN :sort = 'price_high' THEN p.price END DESC ")
	List<Product> filterProducts(@Param("category") String category, @Param("minPrice") Double minPrice,
			@Param("maxPrice") Double maxPrice, @Param("sort") String sort);

}
