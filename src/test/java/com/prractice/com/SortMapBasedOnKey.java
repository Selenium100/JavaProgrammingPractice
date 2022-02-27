/**
 * 
 */
package com.prractice.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.javaprogramming.com.Employee;

/**
 * @author d955012
 *
 */
public class SortMapBasedOnKey {

	
	public static void main(String[] args) {
		
		Map<Integer, Employee> hm=new HashMap<Integer, Employee>();
		hm.put(55555, new Employee("nitya", 150, 80));
		hm.put(33333, new Employee("abhay", 160, 70));
		hm.put(22222, new Employee("viswa", 170, 60));
		hm.put(44444, new Employee("bikash", 180, 50));
		hm.put(11111, new Employee("zenet", 190, 20));
		
		System.out.println(hm);
		
		System.out.println("-------------------------------------------------------");
		
		LinkedHashMap<Integer, Employee>sortedMap=hm.entrySet().stream().sorted((i,j) -> i.getKey().compareTo(j.getKey())).collect(Collectors.toMap(Entry<Integer, Employee>::getKey, Entry<Integer, Employee>::getValue, (e1,e2)-> e1 ,LinkedHashMap::new));
		
       System.out.println(sortedMap);
	}

}
