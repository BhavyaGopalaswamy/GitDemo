package com.test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationExample {
	//Passing the dataprovider with the method name getData to get the data
	@Test(dataProvider = "getData")
	public void testcase(String username, String password) {
		System.out.println("Executing test case");
		System.out.println(username);
		System.out.println(password);
	}
	
	//Method written to pass the data to execute the test cases at the method level using @DataProvider annotation
	@DataProvider
	public Object[][] getData() {
		//1st combination - username & password - good credit history
		//2nd combination - username & password - bad credit history
		//3rd combination - username & password - average credit history
		//4th combination - username & password - fradulent credit history
		
		//combination represents rows and values represents columns. So we will have 4 rows and 2 cols. rows start from 0-3 
		//and cols start from 0-1
		
		// 4 represents 4 combinations and 2 represent values for each combination 
		//ie; each combination has 2 values ie; username and password
		Object[][] data = new Object[4][2];
		
		//1st data set
		data[0][0] = "firstusername";
		data[0][1] ="firstpassword";
		
		//1st data set
		data[1][0] = "secondusername";
		data[1][1] ="secondpassword";
				
		//1st data set
		data[2][0] = "thirdusername";
		data[2][1] ="thirdpassword";
				
		//1st data set
		data[3][0] = "fourthusername";
		data[3][1] ="fourthpassword";
		
		return data;
	}

}
