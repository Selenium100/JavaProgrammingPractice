package com.prractice.com;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksInaWebpage {
	
	WebDriver driver;
	
	@Test
	public void testing() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.computerhope.com/jargon/d/dropdm.htm");
		
		Select s=new Select(driver.findElement(By.name("s")));
		List<WebElement>allOptions=s.getOptions();
		
		
		
		
		
	}

}
