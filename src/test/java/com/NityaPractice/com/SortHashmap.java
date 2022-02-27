/**
 * 
 */
package com.NityaPractice.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortHashmap {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> empMap=new HashMap<Integer, String>();
		empMap.put(38, "Nitya");
		empMap.put(15, "Abhay");
		empMap.put(28, "Bikash");
		empMap.put(78, "Viswa");
		empMap.put(35, "Znita");
		
		
		LinkedHashMap<Integer, String>sortedMap=empMap.entrySet().stream().sorted((i,j) -> i.getKey().compareTo(j.getKey())).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2)-> e1,LinkedHashMap::new));
		
		System.out.println(sortedMap);
	}

}
