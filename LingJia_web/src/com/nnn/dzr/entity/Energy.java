package com.nnn.dzr.entity;

public class Energy {
	
	private String id;
	private String cost;
	private String amount;
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Energy(String id, String cost, String amount) {
		super();
		this.id = id;
		this.cost = cost;
		this.amount = amount;
	}
	public Energy() {
		super();
	}
	public Energy(String id) {
		super();
		this.id = id;
	}
	
}
