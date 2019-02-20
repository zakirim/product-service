package com.cts.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.LabelTypeVo;
import com.cts.model.ProductVo;
import com.cts.repository.PriceReducedProductRepo;
import com.cts.util.ProductConverter;

@Service("priceReducedProductService")
public class PriceReducedProductServiceImpl implements PriceReducedProductService {
	
	@Autowired
	private PriceReducedProductRepo priceReducedProductRepo;
	
	@Autowired
	ProductConverter productConverter;
	
	@Override
	public List<ProductVo> getPriceReducedProducts(Integer categoryId, Optional<LabelTypeVo> priceLabelType) {
		
		//ProductConverter productConverter = new ProductConverter();
		List<ProductVo> listOfProducts = priceReducedProductRepo.getPriceReducedProducts(categoryId)
											.stream().map(product ->{
												return productConverter.convert(product, priceLabelType);
											}).collect(Collectors.toList());
		return listOfProducts;
	}

}
