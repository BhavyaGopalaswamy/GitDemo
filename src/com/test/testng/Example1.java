package com.test.testng;

import org.testng.annotations.Test;

public class Example1 {

	@Test(groups= {"Smoke"})
	public void tc1() {
		System.out.println("My First TestNG testcase");
	}
	
	//setting the timeout to 4000ms for the test case to execute before it throws any failure exception
	@Test(timeOut = 4000)
	public void tc3() {
		System.out.println("My 3 test case in testng");
	}
	
	//setting the attribute enabled to false so that this test case can be skipped for execution.
	//to enable this testcase to be executed set the attribute enabled=true
		@Test(enabled = false)
		public void tc4() {
			System.out.println("My 4 test case in testng");
		}
	
	//dependsOnMethods helper attribute is used to mention that tc2() depends on tc1() and tc3(). 
	//hence it should be executed only after those 2 methods
	@Test(dependsOnMethods = {"tc1","tc3"})
	public void tc2() {
		System.out.println("My 2 test case in testng");
	}

}
