package com.javaprogramming.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickMaxPrice {

	WebDriver driver;
	
	@Test
	public void clickMaxPrice() {
		
		List<WebElement> priceList=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		Double maxPrice=priceList.stream().mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", ""))).max().getAsDouble();
		System.out.println(maxPrice);
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='inventory_item_price' and text()='"+maxPrice+"']/following-sibling::button"));
		ele.click();
		
	}
	
	
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
	}

}
