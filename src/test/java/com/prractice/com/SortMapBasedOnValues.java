package com.prractice.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.javaprogramming.com.Employee;

public class SortMapBasedOnValues {

	public static void main(String[] args) {
		
		Map<Integer, Employee> m1=new HashMap<Integer, Employee>();
		m1.put(77777, new Employee("nitya", 150, 80));
		m1.put(22222, new Employee("abhay", 160, 60));
		m1.put(44444, new Employee("bikash", 170, 70));
		m1.put(55555, new Employee("abhinash", 180, 50));
		m1.put(66666, new Employee("viswa", 190, 30));
		
		Set<Entry<Integer, Employee>> entry=m1.entrySet();
		
		ArrayList<Entry<Integer, Employee>> mapList=new ArrayList<Map.Entry<Integer,Employee>>(entry);
		
		
		
		LinkedHashMap<Integer, Employee>sortedMap=mapList.stream().sorted((i,j)-> i.getValue().geteName().compareTo(j.getValue().geteName())).collect(Collectors.toMap(Entry<Integer, Employee>::getKey, Entry<Integer, Employee>::getValue, (e1,e2)-> e1  , LinkedHashMap::new));
         System.out.println(sortedMap);
		
	}

}
