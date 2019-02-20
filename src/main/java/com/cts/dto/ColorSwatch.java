package com.cts.dto;

public class ColorSwatch {
	
	private String basicColor;
	private String skuId;
	private String color;
	
	public String getBasicColor() {
		return basicColor;
	}
	public void setBasicColor(String basicColor) {
		this.basicColor = basicColor;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColorSwatch [basicColor=" + basicColor + ", skuId=" + skuId + ", color=" + color + "]";
	}
	
	
}
