/**
 * 
 */
package com.prractice.com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetAppInterViewQuestion {

	
	public static void main(String[] args) {
		
		
		String[] str= {"blue","blue","blue","blue","yellow","green","green","yellow"};
		
		LinkedHashMap<String, Integer> hm=new LinkedHashMap<String, Integer>();
		
		for(String s1:str) {
			
			if(hm.get(s1)==null) {
				hm.put(s1, 1);
			}else {
				
				hm.put(s1, hm.get(s1)+1);
				
			}
		}
		
		ArrayList<Entry<String, Integer>> hm1=(ArrayList<Entry<String, Integer>>) hm.entrySet().stream().sorted((i,j) -> 
		i.getValue().compareTo(j.getValue())).collect(Collectors.toList());
		
		System.out.println(hm1.get(hm1.size()-1).getKey());
		
		
	}
	
	
	
	
	
	}


