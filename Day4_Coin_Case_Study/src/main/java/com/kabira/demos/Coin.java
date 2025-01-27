package com.kabira.demos;

public class Coin {
	
	String cuntryName ;
	String denomination;
	String yearOfMinting;
	String currentValue;
	String acquiredDate;
	public Coin(String cuntryName, String denomination, String yearOfMinting, String currentValue,
			String acquiredDate) {
		super();
		this.cuntryName = cuntryName;
		this.denomination = denomination;
		this.yearOfMinting = yearOfMinting;
		this.currentValue = currentValue;
		this.acquiredDate = acquiredDate;
	}
	public String getCuntryName() {
		return cuntryName;
	}
	public void setCuntryName(String cuntryName) {
		this.cuntryName = cuntryName;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getYearOfMinting() {
		return yearOfMinting;
	}
	public void setYearOfMinting(String yearOfMinting) {
		this.yearOfMinting = yearOfMinting;
	}
	public String getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}
	public String getAcquiredDate() {
		return acquiredDate;
	}
	public void setAcquiredDate(String acquiredDate) {
		this.acquiredDate = acquiredDate;
	}
	
	
	
	
	
	

}
