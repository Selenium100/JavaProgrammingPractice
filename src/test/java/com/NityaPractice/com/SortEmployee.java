/**
 * 
 */
package com.NityaPractice.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {

	
	public static void main(String[] args) {
		
		Employee emp1=new Employee("Nitya", 80000, 150, "testing");
		Employee emp2=new Employee("Bikash", 70000, 160, "devlopment");
		Employee emp3=new Employee("Abhay", 100000, 170, "devops");
		Employee emp4=new Employee("Viswa", 50000, 180, "database");
		Employee emp5=new Employee("Zenet", 30000, 190, "admin");
		
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		
		List<Employee> sortedByNameList=empList.stream().sorted((i,j) -> i.getEname().compareTo(j.getEname())).collect(Collectors.toList());
        
		sortedByNameList.stream().forEach(System.out::println);
	}

}
