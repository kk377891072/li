package com.nnn.dzr.entity;

public class Card {

	private String id;
	private String username;
	private String password;
	private Gas gas;
	private Energy energy;
	private Water water;
	private Property property;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Gas getGas() {
		return gas;
	}
	public void setGas(Gas gas) {
		this.gas = gas;
	}
	public Energy getEnergy() {
		return energy;
	}
	public void setEnergy(Energy energy) {
		this.energy = energy;
	}
	public Water getWater() {
		return water;
	}
	public void setWater(Water water) {
		this.water = water;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public Card(String id, String username, String password, Gas gas, Energy energy, Water water, Property property) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gas = gas;
		this.energy = energy;
		this.water = water;
		this.property = property;
	}
	public Card() {
		super();
	}
	public Card(String id) {
		super();
		this.id = id;
	}
	
	

}
