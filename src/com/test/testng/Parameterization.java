package com.test.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Parameters({"URL"})
	@Test
	public void tc1(String url) {
		System.out.println("Executing tc 1");
		//prints the URL value set in the testng.xml for Parameterization.java class
		System.out.println(url); 
	}
	
	@Parameters({"URL"})
	@Test
	public void tc2(String url) {
		System.out.println("Executing tc 2");
		//prints the URL value set in the testng.xml for Parameterization.java class
		System.out.println(url); 
	}
	
	@Test
	public void tc3() {
		System.out.println("Executing tc 3");
		System.out.println("Executing tc 3 A");
		System.out.println("Executing tc 3 B");
	}
	
	@Test
	public void tc4() {
		System.out.println("Executing tc 4");
		System.out.println("Executing tc 4 A");
		System.out.println("Executing tc 4 B");
	}
}
