package com.javaprogramming.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.graph.Traverser;

public class WordOcuurance {

	public static void main(String[] args) {
		
		
		String str= "I I AM AM AM A A A A PROGRAMMER";
		
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		
		String[] strArr=str.split(" ");
		
		for(String each:strArr) {
			
			if(lhm.get(each)==null) {
				
				lhm.put(each, 1);
			}else {
				
				lhm.put(each, lhm.get(each)+1);
			}
			
		}
			
		
		lhm.entrySet().stream().forEach(System.out::println);
			

	}

}
