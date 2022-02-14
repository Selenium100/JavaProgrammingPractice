package com.javaprogramming.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAccordingToLengh {

	public static void main(String[] args) {
		
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("A");
		arrList.add("AAAAAA");
		arrList.add("AA");
		arrList.add("AAAAAAAAA");
		arrList.add("AAAAA");
		
		System.out.println(arrList);
		
		Comparator<String> c= (a,b) -> (a.length()<b.length())?1:(a.length()>b.length())?-1:a.compareTo(b);
		
		List<String>sortedbyLength=arrList.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedbyLength);
		

	}

}
