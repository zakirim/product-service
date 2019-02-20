package com.cts.repository;

import java.util.List;

import com.cts.dto.Product;

public interface PriceReducedProductRepo {
	
	List<Product> getPriceReducedProducts(Integer categoryId);
	
}
