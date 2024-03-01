package com.fashionsuperior.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fashionsuperior.entities.Category;
import com.fashionsuperior.entities.Product;
import com.fashionsuperior.entities.Seller;
import com.fashionsuperior.repository.ProductRepository;
import com.fashionsuperior.utils.StorageService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepo;

	@Autowired
	private StorageService storageService;

	@Autowired
	SellerService sellerService;

	@Autowired
	CategoryService categoryService;

	@Override
	public Product addProduct(Product product, MultipartFile pic) {

		// pic is saved and returns the filepath in string
		String photo = storageService.store(pic);

		product.setPhoto(photo);
		productRepo.save(product);
		return product;
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("updating product.. ");
		Optional<Product> pp = productRepo.findById(product.getProductId());

		product.setSeller(pp.get().getSeller());
		productRepo.save(product);
	}

	@Override
	public List<Product> findProducts(int sellerId) {
		Optional<Seller> seller = sellerService.findSellerById(sellerId);
		return productRepo.findBySeller(seller.get());
	}

	@Override
	public Page<Product> getAllProduct(String category,List<String> colors, Double minPrice,
			Double maxPrice, String sort, Integer pageNumber, Integer pageSize) {

		Pageable pageable = PageRequest.of(pageNumber, pageSize);

		List<Product> products = productRepo.filterProducts(category, minPrice, maxPrice, sort);

		if (!colors.isEmpty()) {
			products = products.stream().filter(p -> colors.stream().anyMatch(c -> c.equalsIgnoreCase(p.getColour())))
					.collect(Collectors.toList());

		}

		int startIndex = (int) pageable.getOffset();
		int endIndex = Math.min(startIndex + pageable.getPageSize(), products.size());

		List<Product> pageContent = products.subList(startIndex, endIndex);
		Page<Product> filteredProducts = new PageImpl<>(pageContent, pageable, products.size());
		return filteredProducts; // If color list is empty, do nothing and return all products

	}

	@Override
	public Optional<Product> findProductById(int productId) {
		return productRepo.findById(productId);
	}

	@Override
	public List<Product> categoryProducts(String categoryName) {
		// TODO Auto-generated method stub
		Category category = categoryService.findByCategoryName(categoryName);
		return productRepo.findByCategory(category);
	}

	@Override
	public Page<Product> allProductsPaginated(int page, int pagesize) {
		Page<Product> prods = productRepo.findAll(PageRequest.of(page, pagesize, Sort.by(Direction.DESC, "productId")));
		System.err.println(prods.getSize());
		return prods;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

}
