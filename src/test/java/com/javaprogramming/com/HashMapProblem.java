package com.javaprogramming.com;

import java.util.Collection;
import java.util.HashMap;

public class HashMapProblem {

	public static void main(String[] args) {
		
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("India", "Asia");
		hm.put("Bangladesh", "Asia");
		hm.put("Astria", "Europe");
		hm.put("Iceland", "Europe");
		hm.put("Srilanka", "Asia");
		
		Collection<String> values=hm.values();
		
		HashMap<String, Integer> countryCount=new HashMap<String, Integer>();
		
		for(String s:values) {
			
			if(countryCount.get(s)==null) {
				
				countryCount.put(s, 1);
			}else
			
			countryCount.put(s, countryCount.get(s)+1);
		}
		
		
		System.out.println(countryCount);
			
		}
		
		
		
			
			
		
			
		

	}


