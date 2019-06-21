package com.test.testng;

import org.testng.annotations.Test;

public class CarLoan {
	
	@Test(groups= {"Smoke"})
	public void carLoanWebLogin() {
		System.out.println("Welcome to car loan web login page");
	}
	
	@Test
	public void carLoanMobileLogin() {
		System.out.println("Welcome to car loan mobile login page");
	}
	
	@Test
	public void carLoanAPILogin() {
		System.out.println("Welcome to car loan api login page");
	}

}
