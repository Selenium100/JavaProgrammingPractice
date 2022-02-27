/**
 * 
 */
package com.prractice.com;



import org.openqa.selenium.WebDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.javaprogramming.utility.ExcelUtils;



public class AppTest {
	
	WebDriver driver;
	
	@Test(dataProvider="data")
	public void applicationTesting(String url,String pasword) throws Exception {
		
		
		System.out.println(url);
		System.out.println(pasword);
		
		
	}
	
	
	@DataProvider(name="data")
	public Object[][] getdata() throws Exception{
		
		Object[][] data= new ExcelUtils(System.getProperty("user.dir")+"\\datalist.xlsx", "Sheet1").getTableArray();
		return data;
	}
	
	
	
	
	
	
	

}
