package com.luchilaffe.main;

import com.luchilaffe.main.model.Customer;

import java.util.ArrayList;

import com.luchilaffe.main.model.Bike;

public class BikeRental {
	
	public enum Period {
		HOUR,
		DAY,
		WEEK;
	}
	
	Customer customer;
	ArrayList<Bike> rentedBikes;
	int numberOfPeriods;
	Period period;
	float discount;
	float subTotalCost;
	
	
	public BikeRental(Customer aCustomer, Period aPeriod, int numberOfPeriods, ArrayList<Bike> bikes) {
		if (aCustomer != null && aPeriod != null && numberOfPeriods > 0) {
			this.setCustomer(aCustomer);
			this.setPeriod(aPeriod);
			this.setNumberOfPeriods(numberOfPeriods);
			this.setRentedBikes(bikes);
			this.calculateCost();
			this.calculateDiscount();
		}else {
			throw new IllegalArgumentException("Invalid arguments for rental.");
		}
	}
	
	public float getTotalCost() {
		float cost = 0;
		cost = this.getSubTotalCost() - this.getDiscount();
		return cost;
	}
	
	private void calculateCost() {
		switch (this.getPeriod()) {
			case HOUR:	this.setSubTotalCost( this.getNumberOfPeriods() * this.getRentedBikes().size() * 5  );
						break;
			case DAY:	this.setSubTotalCost( this.getNumberOfPeriods() * this.getRentedBikes().size() * 20 );
						break;
			case WEEK:	this.setSubTotalCost( this.getNumberOfPeriods() * this.getRentedBikes().size() * 60 );
						break;
		}
	}

	private void calculateDiscount() {
		if ( (rentedBikes.size() >= 3 ) && (rentedBikes.size() <= 5) ) {
			this.setDiscount( (float) (this.getSubTotalCost() * (0.3)) );
		}else {
			this.setDiscount(0);
		}
	}

	
	
	
	private Customer getCustomer() {
		return customer;
	}

	private ArrayList<Bike> getRentedBikes() {
		return rentedBikes;
	}

	private int getNumberOfPeriods() {
		return numberOfPeriods;
	}

	private Period getPeriod() {
		return period;
	}

	private float getDiscount() {
		return discount;
	}

	private float getSubTotalCost() {
		return subTotalCost;
	}

	private void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private void setRentedBikes(ArrayList<Bike> rentedBikes) {
		for (int i = 0; i < rentedBikes.size(); i++){
			if (rentedBikes.get(i).rent() != true) {
				throw new IllegalArgumentException ("Bike is already rented!");
			}
		}
		this.rentedBikes = rentedBikes;
	}

	private void setNumberOfPeriods(int NumberOfPeriods) {
		this.numberOfPeriods = NumberOfPeriods;
	}

	private void setPeriod(Period period) {
		this.period = period;
	}

	private void setDiscount(float discount) {
		this.discount = discount;
	}

	private void setSubTotalCost(float subTotalCost) {
		this.subTotalCost = subTotalCost;
	}
	

}
