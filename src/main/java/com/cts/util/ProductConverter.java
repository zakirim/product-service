package com.cts.util;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.dto.Price;
import com.cts.dto.Product;
import com.cts.model.LabelTypeVo;
import com.cts.model.ProductVo;

@Component
public class ProductConverter {
	
	@Autowired
	private ColorSwatchConverter colorSwatchConverter;
	
	public ProductVo convert(Product source, Optional<LabelTypeVo> labelType) {
		
		if(source==null)
			return null;

		String priceLabel = changePriceLabel(labelType, source.getPrice());
		
		ProductVo target = new ProductVo();
		
		target.setProductId(source.getProductId());
		target.setTitle(source.getTitle());
		target.setPriceLabel(priceLabel);
		target.setNowPrice(nowPrice(source.getPrice()));
		
		if(source.getColorSwatches() != null) {
			target.setColorSwatches(source.getColorSwatches().stream().map(x->{
				return colorSwatchConverter.convert(x);
			}).collect(Collectors.toList()));
		}
		
		return target;
	}

	private String changePriceLabel(Optional<LabelTypeVo> labelType, Price price) {
		
		String response="";
		
		LabelTypeVo priceLabel = labelType.map(x -> {
									return x;
								}).orElse(LabelTypeVo.ShowWasNow);
		
		
		if(LabelTypeVo.ShowWasNow.equals(priceLabel)) {
			response = price.getWas().map( x -> {
					return "Was " +price.getCurrency().getResponse()+x+", now "+nowPrice(price);
				}).orElse("Was "+nowPrice(price)+", now "+nowPrice(price));
		}
		else if(LabelTypeVo.ShowWasThenNow.equals(priceLabel)) {
			
		}
		else if(LabelTypeVo.ShowPercDscount.equals(priceLabel)) {
			
		}
		
		return response;
	}
	
	private String nowPrice(Price price) {
		
		Double nowPrice;
		
		try {
			nowPrice = Double.parseDouble((String)price.getNow());
		}catch (Exception e) {
			
			nowPrice = 0.00;
		}
		
		return nowPrice <10 ? price.getCurrency().getResponse()+Math.round(nowPrice) : price.getCurrency().getResponse()+ nowPrice;
	}
	
}
