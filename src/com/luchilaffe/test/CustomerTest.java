package com.luchilaffe.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.luchilaffe.main.model.Customer;

public class CustomerTest {

	Customer customer;
	
	
	/*
	 * Constructor(name) Test
	 */
	
	@Test (expected = IllegalArgumentException.class)
	public void testNewCustomerWithNameNull() {
		// GIVEN
		String name = null;
		
		// WHEN
		new Customer(name);
	}
	
	@Test
	public void testNewCustomerWithName() {
		// GIVEN
		String name = "Amparo";	
		
		// WHEN
		customer = new Customer(name);
		
		// THEN
		assertEquals(customer.getName(), name);
	}
	
	/*
	 * Constructor(name, address) Test
	 */
	
	@Test (expected = IllegalArgumentException.class)
	public void testNewCustomerWithAddressNull() {
		// GIVEN
		String name = "Amparo";
		String address = null;	
		
		// WHEN
		new Customer(name, address);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testNewCustomerWithNameNullAndAddressNotNull() {
		// GIVEN
		String name = null;
		String address = "San Martin 654";
		
		// WHEN
		new Customer(name, address);
	}

	@Test
	public void testNewCustomerWithNameAndAddress() {
		// GIVEN
		String name = "Amparo";
		String address = "San Martin 654";
		
		// WHEN
		customer = new Customer(name, address);
		
		// THEN
		assert( (customer.getName() == name) && (customer.getAddress() == address) );
	}

}
