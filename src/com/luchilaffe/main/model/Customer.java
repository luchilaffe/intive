package com.luchilaffe.main.model;

public class Customer {
	
	private String name;
	private String address;
	
	public Customer (String aName) {
		if (aName == null) {
            throw new IllegalArgumentException("Valid customer name is required");
        }
		this.setName(aName);
	}
	
	public Customer (String aName, String anAddress) {
		if (aName == null || anAddress == null) {
            throw new IllegalArgumentException("Valid customer name and address is required");
        }
		this.setName(aName);
		this.setAddress(anAddress);
	}
	
	public void addAddress(String anAddress) {
		if (anAddress == null) {
			throw new IllegalArgumentException("Valid customer address is required");
		}
		this.setAddress(anAddress);
	}
	
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	
	private void setName(String name) {
		this.name = name;
	}
	private void setAddress(String address) {
		this.address = address;
	}
}