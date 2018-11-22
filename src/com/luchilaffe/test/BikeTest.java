package com.luchilaffe.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.luchilaffe.main.model.Bike;

public class BikeTest {

	Bike bike;
		
	/*
	 * Constructor() Test
	 */
	
	@Test
	public void testNewBikeIsFree() {
		// WHEN
		bike = new Bike();
	
		// THEN
		assertTrue(bike.isFree());
	}
	
	/*
	 * Rent() Test
	 */
	@Test
	public void testRentSetBikeNotFree() {
		// GIVEN
		bike = new Bike();
		
		// WHEN
		bike.rent();

		// THEN
		assertFalse(bike.isFree());
	}
	
	/*
	 * ReturnRented() Test
	 */
	@Test
	public void testReturnRentedSetBikeFree() {
		// GIVEN
		bike = new Bike();
		bike.rent();
		
		// WHEN
		bike.returnRented();

		// THEN
		assertTrue(bike.isFree());
	}

	/*
	 * IsFree() Test
	 */
	@Test
	public void testIsFreeWhenReturned() {
		// GIVEN
		bike = new Bike();
		bike.rent();
		
		// WHEN
		bike.returnRented();

		// THEN
		assertTrue(bike.isFree());
	}

	@Test
	public void testIsNotFreeWhenIsRent() {
		// GIVEN
		bike = new Bike();
		
		// WHEN
		bike.rent();

		// THEN
		assertFalse(bike.isFree());
	}

}
