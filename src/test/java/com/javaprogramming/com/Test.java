package com.javaprogramming.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Test {
	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("nitya", 150, 80);
		Employee e2=new Employee("abhay", 160, 30);
		Employee e3=new Employee("bikash", 170, 20);
		Employee e4=new Employee("cdity", 180, 40);
		Employee e5=new Employee("znil", 190, 10);
		
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		
		List<Employee> sortedListbyName=empList.stream().sorted((a,b) -> -a.geteName().compareTo(b.geteName())).collect(Collectors.toList());
	    
		System.out.println(sortedListbyName);
	
	
	}
}

