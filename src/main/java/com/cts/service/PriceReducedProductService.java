package com.cts.service;

import java.util.List;
import java.util.Optional;

import com.cts.model.LabelTypeVo;
import com.cts.model.ProductVo;

public interface PriceReducedProductService {
	
	List<ProductVo> getPriceReducedProducts(Integer categoryId, Optional<LabelTypeVo> priceLabelType);
}
