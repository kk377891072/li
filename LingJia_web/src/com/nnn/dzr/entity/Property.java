package com.nnn.dzr.entity;

public class Property {

	private String id;
	private String cost;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Property(String id, String cost) {
		super();
		this.id = id;
		this.cost = cost;
	}
	public Property(String id) {
		super();
		this.id = id;
	}
	public Property() {
		super();
	}
	
	
}
