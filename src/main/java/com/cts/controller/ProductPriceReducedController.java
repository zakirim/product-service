package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.LabelTypeVo;
import com.cts.model.ProductVo;
import com.cts.service.PriceReducedProductService;

@RestController

public class ProductPriceReducedController {
	
	@Autowired
	PriceReducedProductService priceReducedProductService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/productpricereducedbycategoryid/{categoryId}")
	public List<ProductVo> getPriceReducedProductByCategoryId(@PathVariable(required=true) Integer categoryId,
											@RequestParam(required=false) LabelTypeVo priceLabelType){
		
		Optional<LabelTypeVo> labelType = Optional.ofNullable(priceLabelType);
		
		return priceReducedProductService.getPriceReducedProducts(categoryId, labelType);
	}
		
}
