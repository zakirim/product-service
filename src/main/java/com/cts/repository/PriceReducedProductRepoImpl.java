package com.cts.repository;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.cts.dto.Category;
import com.cts.dto.Product;

@Repository("priceReducedProductRepo")
public class PriceReducedProductRepoImpl implements PriceReducedProductRepo{

	@Override
	public List<Product> getPriceReducedProducts(Integer categoryId) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		String resourceUrl = "https://jl-nonprod-syst.apigee.net/v1/categories/" +categoryId+ "/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma";
		
		ResponseEntity<Category> response
		  			= restTemplate.exchange(
		  					resourceUrl ,
		  					HttpMethod.GET,
		  					null,
		  					new ParameterizedTypeReference<Category>(){});
		
		if(response.getStatusCode().is2xxSuccessful()) {
			
		}
				
		return response.getBody().getProducts();
	}

}
