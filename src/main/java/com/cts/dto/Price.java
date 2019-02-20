package com.cts.dto;

import java.util.Optional;

public class Price {

	private Optional<Double> was;
	private Optional<Double> then1;
	private Optional<Double> then2;
	private Object now;
	private CurrencyEnum currency;
	
	public Optional<Double> getWas() {
		return was;
	}
	public void setWas(Optional<Double> was) {
		this.was = was;
	}
	public Optional<Double> getThen1() {
		return then1;
	}
	public void setThen1(Optional<Double> then1) {
		this.then1 = then1;
	}
	public Optional<Double> getThen2() {
		return then2;
	}
	public void setThen2(Optional<Double> then2) {
		this.then2 = then2;
	}
	public Object getNow() {
		return now;
	}
	public void setNow(Object now) {
		this.now = now;
	}
	public CurrencyEnum getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}
	
	@Override
	public String toString() {
		return "Price [was=" + was + ", then1=" + then1 + ", then2=" + then2 + ", now=" + now + ", currency=" + currency
				+ "]";
	}
	
	
}
