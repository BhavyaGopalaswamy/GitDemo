package com.test.testng;

import org.testng.annotations.Test;

public class Example2 {
	
	@Test(groups= {"Smoke"})
	public void tc3() {
		System.out.println("My test case3 in testng");
	}

}
