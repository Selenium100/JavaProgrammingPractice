package com.javaprogramming.com;

import java.util.Date;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CharacterOccurance {
	
	
	public static void main(String[] args) {
		
		
		String word="Nityaisagoodboy";
		
		char[] charArr=word.toCharArray();
		
		LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<Character, Integer>();
		for(Character eachChar:charArr) {
			
			if(lhm.get(eachChar)==null) {
				
				lhm.put(eachChar, 1);
			}else {
				
				lhm.put(eachChar, lhm.get(eachChar)+1);
			}
			
		}
		
		lhm.entrySet().stream().forEach(System.out::println);
		
		WebDriver driver=new ChromeDriver();
		
	}

}
