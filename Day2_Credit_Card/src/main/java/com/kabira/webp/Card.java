package com.kabira.webp;

public class Card {

	String cardHolderName;
	String cardnumber;
	String expDate;
	String pin;

	// this know as an entity class
	// also know as value object / DTO (Data Transfer Object )
	// Also known as POJO (Plain Old Java Object ) / Bean technical term
	public Card(String cardHolderName, String cardnumber, String expDate, String pin) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardnumber = cardnumber;
		this.expDate = expDate;
		this.pin = pin;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
