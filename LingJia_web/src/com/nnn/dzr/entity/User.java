package com.nnn.dzr.entity;

public class User {
	
	private String id;
	private String name;
	private String address;
	private Card card;
	
	
	
	public User(String id, String name, String address, Card card) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.card = card;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Card getCard() {
		return card;
	}



	public void setCard(Card card) {
		this.card = card;
	}



	public User() {
		
	}

}
