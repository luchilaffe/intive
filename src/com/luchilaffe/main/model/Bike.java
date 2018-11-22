package com.luchilaffe.main.model;

public class Bike {
	boolean rented;
	
	public Bike() {
		this.setNotRented();
	}
	
	public boolean rent() {
		if (this.isFree()) {
			this.setRented();
			return true;
		}else {
			return false;
		}
	}

	public void returnRented(){
		if (this.isFree()) {
			throw new IllegalStateException("This bike is already free.");
		}else {
			this.setNotRented();
		}
	}

	public boolean isFree() {
		if (this.rented == false) {
			return true;			
		}else{
			return false;
		}
	}
	
	
	private void setNotRented() {
		this.rented = false;
	}
	private void setRented() {
		this.rented = true;
	}

}
