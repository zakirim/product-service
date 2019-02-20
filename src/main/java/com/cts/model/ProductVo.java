package com.cts.model;

import java.util.ArrayList;
import java.util.List;

public class ProductVo {
	
	private String productId;
	private String title;
	private String nowPrice;
	private String priceLabel;
	
	private List<ColorSwatchVo> colorSwatches = new ArrayList<>();
	
	public String getPriceLabel() {
		return priceLabel;
	}
	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<ColorSwatchVo> getColorSwatches() {
		return colorSwatches;
	}
	public void setColorSwatches(List<ColorSwatchVo> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
	public String getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", title=" + title + ", colorSwatches=" + colorSwatches
				+ ", nowPrice=" + nowPrice + "]";
	}
	
	
	/*
	private String id;                                               
	private String title;                                            
	private String nowPrice;                                         
	private String priceLabel;                                       
	private Float discount;                                          
	private List<ColorSwatchModel> colorSwatches = new ArrayList<>();
	*/
}
