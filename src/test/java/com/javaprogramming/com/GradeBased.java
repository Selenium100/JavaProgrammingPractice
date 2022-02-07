package com.javaprogramming.com;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeBased {

	public static void main(String[] args) {
		
		
		
		
		
		Function<Employee, String> f= e -> {
			
			String grade="";
			if(e.geteMark()>=80)
				grade="A";
			
			else if(e.geteMark()>=60)
				grade="B";
			
			else if(e.geteMark()>=40)
				grade="C";
			
			else
				grade="FAIL";
			
			return grade;
		};
		
		
		Predicate<Employee> p= e -> e.geteMark()>=60;
		
		Consumer<Employee> c= e1 -> {
			
			System.out.println("Employee Name is " + e1.geteName() );
			System.out.println("Employee  Eno is " + e1.getEno() );
			System.out.println("Employee Grade is " + f.apply(e1) + " " +  e1.geteMark());
			System.out.println();
		};
		
		Employee[] empArr= {new Employee("Nitya", 150, 90),
	            new Employee("Rinky", 160, 80),
	            new Employee("Abhay", 170, 70),
	            new Employee("Viswa", 180, 60),
	            new Employee("Bikash", 190, 50),
	            new Employee("Vinny", 200, 29)};
		
		for(Employee e1:empArr) {
			
			//if(p.test(e1)) 
			
			c.accept(e1);
			
		}

	}

}
