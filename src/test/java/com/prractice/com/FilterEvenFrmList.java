package com.prractice.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.jsoup.select.Collector;

public class FilterEvenFrmList {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(30);
		l.add(100);
		l.add(50);
		l.add(1);
		l.add(2);
		
		
		
	
	List<Integer>sortedList=l.stream().sorted(new Mycomparator()).collect(Collectors.toList());
	System.out.println(sortedList);
	
		

}
	
	
		
	}

