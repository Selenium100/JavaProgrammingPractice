/**
 * 
 */
package com.NityaPractice.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapEmployee {

	
	public static void main(String[] args) {
		
		HashMap<Integer, Employee> hs=new HashMap<Integer, Employee>();
		hs.put(34, new Employee("Nitya", 80000, 150, "eesting"));
		hs.put(35, new Employee("Bikash", 70000, 160, "devlopment"));
		hs.put(36, new Employee("Abhay", 100000, 170, "cevops"));
		hs.put(37, new Employee("Viswa", 50000, 180, "batabase"));
		hs.put(38, new Employee("Zenet", 30000, 190, "admin"));
		
		
		LinkedHashMap<Integer, Employee> sortedMap=hs.entrySet().stream().sorted((i,j) -> i.getValue().getEdept().compareTo(j.getValue().getEdept())).collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)-> e1, LinkedHashMap::new));
		
		System.out.println(sortedMap);

	}

}
