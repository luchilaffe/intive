package com.luchilaffe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.luchilaffe.main.BikeRental;
import com.luchilaffe.main.BikeRental.Period;
import com.luchilaffe.main.model.Bike;
import com.luchilaffe.main.model.Customer;

class BikeRentalTest {

	Customer c1;
	Customer c2;
	Customer c3;
	ArrayList<Bike> bikesForRental;
	
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Customer("Amparo", "San Martin 654");
		c2 = new Customer("Blanca", "Tacuari 270");
		c3 = new Customer("Carlos", "17 de Agosto 1911");
		bikesForRental = new ArrayList<Bike>();
		for (int i = 0; i<=20; i++) {
			Bike bike = new Bike();
			bikesForRental.add(bike);
		}
	}

	@Test
	void testNewRentalByHour() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.HOUR, 1, aLB);

		// THEN
		assertEquals(rent.getTotalCost(), 5);
	}
	
	@Test
	void testNewRentalByDay() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.DAY, 1, aLB);

		// THEN
		assertEquals(rent.getTotalCost(), 20);
	}

	@Test
	void testNewRentalByWeek() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.WEEK, 1, aLB);

		// THEN
		assertEquals(rent.getTotalCost(), 60);
	}

	@Test
	void testNewRentalByHourWithDiscount() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		aLB.add(bikesForRental.get(1));
		aLB.add(bikesForRental.get(2));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.HOUR, 1, aLB);
		float expected = (float) ( aLB.size() * 5 );
		float discount = (float) (expected * 0.3) ;
		expected -= discount;

		// THEN
		assertEquals(expected, rent.getTotalCost());
	}

	@Test
	void testNewRentalByDayWithDiscount() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		aLB.add(bikesForRental.get(1));
		aLB.add(bikesForRental.get(2));
		aLB.add(bikesForRental.get(3));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.DAY, 1, aLB);
		float expected = (float) ( aLB.size() * 20 );
		float discount = (float) (expected * 0.3) ;
		expected -= discount;

		// THEN
		assertEquals(expected, rent.getTotalCost());
	}
	
	@Test
	void testNewRentalByWeekWithDiscount() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		aLB.add(bikesForRental.get(1));
		aLB.add(bikesForRental.get(2));
		aLB.add(bikesForRental.get(3));
		aLB.add(bikesForRental.get(4));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.WEEK, 1, aLB);
		float expected = (float) ( aLB.size() * 60 );
		float discount = (float) (expected * 0.3) ;
		expected -= discount;

		// THEN
		assertEquals(expected, rent.getTotalCost());
	}

	@Test
	void testNewRentalByHourNOTWithDiscount() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		aLB.add(bikesForRental.get(1));
		aLB.add(bikesForRental.get(2));
		aLB.add(bikesForRental.get(3));
		aLB.add(bikesForRental.get(4));
		aLB.add(bikesForRental.get(5));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.HOUR, 1, aLB);
		float expected = (float) ( aLB.size() * 5 );

		// THEN
		assertEquals(expected, rent.getTotalCost());
	}

	@Test
	void testNewRentalByDayNOTWithDiscount() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		aLB.add(bikesForRental.get(1));
		aLB.add(bikesForRental.get(2));
		aLB.add(bikesForRental.get(3));
		aLB.add(bikesForRental.get(4));
		aLB.add(bikesForRental.get(5));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.DAY, 1, aLB);
		float expected = (float) ( aLB.size() * 20 );

		// THEN
		assertEquals(expected, rent.getTotalCost());
	}

	@Test
	void testNewRentalByWeekNOTWithDiscount() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		aLB.add(bikesForRental.get(1));
		aLB.add(bikesForRental.get(2));
		aLB.add(bikesForRental.get(3));
		aLB.add(bikesForRental.get(4));
		aLB.add(bikesForRental.get(5));
		
		// WHEN
		BikeRental rent = new BikeRental(c1, Period.WEEK, 1, aLB);
		float expected = (float) ( aLB.size() * 60 );

		// THEN
		assertEquals(expected, rent.getTotalCost());
	}
	
	@Test
	void testNewRentaThrowException() {
		// GIVEN
		ArrayList<Bike> aLB = new ArrayList<Bike>();
		aLB.add(bikesForRental.get(0));
		new BikeRental(c1, Period.HOUR, 1, aLB);
		
		// WHEN
		assertThrows(IllegalArgumentException.class,
						()->{	
							new BikeRental(c2, Period.HOUR, 1, aLB);
							}
					);
	}

}