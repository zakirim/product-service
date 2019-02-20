package com.cts.dto;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String productId;
	private String title;
	private Price price;
	private List<ColorSwatch> colorSwatches = new ArrayList<>();
	
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
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public List<ColorSwatch> getColorSwatches() {
		return colorSwatches;
	}
	public void setColorSwatches(List<ColorSwatch> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", title=" + title + ", price=" + price + ", colorSwatches="
				+ colorSwatches + "]";
	};
	
	
}
