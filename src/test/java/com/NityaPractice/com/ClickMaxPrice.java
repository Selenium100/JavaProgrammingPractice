/**
 * 
 */
package com.NityaPractice.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickMaxPrice {
	
	WebDriver driver;
	
	@Test
	public void clickMaxPrice() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		List<WebElement> eleList=  driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		Double maxPrice=   eleList.stream().map(WebElement::getText).map(i -> Double.valueOf(i.replace("$", ""))).max(Double::compare).get();
		
		driver.findElement(By.xpath("//div[@class='inventory_item_price' and text()='"+maxPrice+"']//following-sibling::button")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Nitya");
		
		driver.findElement(By.name("lastName")).sendKeys("Ranjan");
		
		driver.findElement(By.name("postalCode")).sendKeys("751003");
		
		driver.findElement(By.name("continue")).click();
		
		driver.findElement(By.name("finish")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Checkout: Complete!']")).getText(), "CHECKOUT: COMPLETE!");
		
	}
	
	

}
