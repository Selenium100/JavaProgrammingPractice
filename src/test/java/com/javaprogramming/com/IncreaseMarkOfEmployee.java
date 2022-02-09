package com.javaprogramming.com;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class IncreaseMarkOfEmployee {

	public static void main(String[] args) {
		
		
		
		ArrayList<Employee> empArr=new ArrayList<Employee>();
		empArr.add(new Employee("Nitya", 150, 70));
		empArr.add(new Employee("Rinky", 170, 60));
		
		BiConsumer<Employee, Integer> bic=(e,d) -> {
			
			e.eMark=e.eMark+d;
		};
		
		for(Employee e:empArr) {
			
			bic.accept(e, 20);
		}
		
		for(Employee e1:empArr) {
			
			System.out.println("Employee name is " + e1.geteName() + " Mark is " + e1.geteMark());
		}
		
		
	}

}
