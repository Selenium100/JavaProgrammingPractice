package com.javaprogramming.com;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeBasedArrange {

	
	
	public static void main(String[] args) {
		
		
		
		//Write one Function for Grade
		Function<Employee, String> f= e -> {
			String grade="";
			if(e.geteMark()>=80)
				grade="A";
			
			else if(e.geteMark()>=60)
				grade="B";
			
			else if (e.geteMark()>=40)
				grade="C";
			
			else
				grade="FAIL";
			
			
			return grade;
			
		};
		
		//Write consumer to print
		Consumer<Employee> c= e1 -> {
			
			
			System.out.println("The name of the Employee is " + e1.geteName());
			System.out.println("The employee no. of the Employee is " + e1.getEno());
			System.out.println("The Grade of the Employee is " + f.apply(e1));
			System.out.println();
			
		};
		
		//Write predicate to check condition who is fail
		Predicate<Employee> p= e -> e.geteMark()<30;
		
        //Create Employee array
		Employee[] empArr= {new Employee("Nitya", 500, 100),
				            new Employee("Abhay", 400, 80),
				            new Employee("Kisan", 300, 60),
				            new Employee("Anita", 200, 40),
				            new Employee("Vinny", 100, 20)
				
		};
		
		//Iterate it.
		for(Employee e1:empArr) {
			
			
			if(p.test(e1))
			
			c.accept(e1);
		}

	}

}
