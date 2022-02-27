package com.javaprogramming.com;

import java.util.ArrayList;


public class MinandMaxValueFromList {

	public static void main(String[] args) {
		
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(31);
		intList.add(21);
		intList.add(10);
		intList.add(51);
		intList.add(61);
		
		
		
		
		
		
		
		
		Integer maxValue=intList.stream().max((a,b) -> a.compareTo(b)).get();
		System.out.println(maxValue);
		
		Integer minValue=intList.stream().min((a,b) -> a.compareTo(b)).get();
		System.out.println(minValue);
		

	}

}
