package com.proEstimates.models;

public class Quotes {
	private int quote_id;
	private int user_id;
	private String material_name;
	private int quote_measurement;
	private int quote_price;
	private String quote_material;
	public int getQuote_id() {
		return quote_id;
	}
	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public int getQuote_measurement() {
		return quote_measurement;
	}
	public void setQuote_measurement(int quote_measurement) {
		this.quote_measurement = quote_measurement;
	}
	public int getQuote_price() {
		return quote_price;
	}
	public void setQuote_price(int quote_price) {
		this.quote_price = quote_price;
	}
	public String getQuote_material() {
		return quote_material;
	}
	public void setQuote_material(String quote_material) {
		this.quote_material = quote_material;
	}
	
	
}
