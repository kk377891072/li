package com.nnn.dzr.entity;

public class Log {
	private String id;
	private String context;
	private Card card;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Log(String id, String context, Card card) {
		super();
		this.id = id;
		this.context = context;
		this.card = card;
	}
	public Log() {
		super();
	}
	
	
}
