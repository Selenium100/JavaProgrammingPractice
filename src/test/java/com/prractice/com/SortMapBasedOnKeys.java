/**
 * 
 */
package com.prractice.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.javaprogramming.com.Employee;

/**
 * @author d955012
 *
 */
public class SortMapBasedOnKeys {

	
	public static void main(String[] args) {
		
		Map<Integer, Employee> m1=new HashMap<Integer, Employee>();
		m1.put(77777, new Employee("nitya", 150, 80));
		m1.put(22222, new Employee("abhay", 160, 60));
		m1.put(44444, new Employee("bikash", 170, 70));
		m1.put(55555, new Employee("abhinash", 180, 50));
		m1.put(66666, new Employee("viswa", 190, 30));
		
		
		Set<Entry<Integer, Employee>>entryset=m1.entrySet();
		
		ArrayList<Entry<Integer, Employee>> list=new ArrayList<Map.Entry<Integer,Employee>>(entryset);
		
		List<Entry<Integer, Employee>>sortedList=list.stream().sorted((i,j) -> -i.getValue().geteMark().compareTo(j.getValue().geteMark())).collect(Collectors.toList());
		
		sortedList.stream().forEach(System.out::println);
		
	}

}
