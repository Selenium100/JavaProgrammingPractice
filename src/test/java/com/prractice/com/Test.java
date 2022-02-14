/**
 * 
 */
package com.prractice.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;

import com.javaprogramming.com.Employee;

/**
 * @author d955012
 *
 */
public class Test {

	public static void main(String[] args) {

		
		Employee e1=new Employee("nitya", 150, 80);
		Employee e2=new Employee("abhay", 160, 70);
		Employee e3=new Employee("bikash", 170, 40);
		Employee e4=new Employee("viswa", 180, 30);
		Employee e5=new Employee("abhishek", 190, 20);
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		
		empList.stream().forEach(System.out::println);
		
		
		
		
		
	
	
		
	}

}
