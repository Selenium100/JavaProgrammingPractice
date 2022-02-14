package com.javaprogramming.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public interface Utility {
	
	static String generateOTP() {
		
		Supplier<String> s= () -> {
			
			String otp="";
			for(int i=0;i<6;i++) 
				
				otp=otp+ (int)(Math.random()*10);
			return otp;
		};
		
		return s.get();
		
	}
	
	static boolean checkEvenSum(int a, int b) {
		
		BiPredicate<Integer, Integer> bi= (a1,b1) -> (a1+b1)%2==0;
		
		return bi.test(a, b);
	}
	
	static <T> void  iterateList(ArrayList<T> T) {
		
		for(T t: T) {
			
			System.out.println(t);
		}
		
	}
	
	static int stringLength(String str) {
		
		ToIntFunction<String> f= e -> e.length();
		return f.applyAsInt(str);
	}
	
	static double squareroot(int x) {
		
		IntToDoubleFunction f= e -> e*e;
		return f.applyAsDouble(x);
	}
	
	
	
	static <T> void tracerseList(Set<T> T) {
		
		T.stream().forEach(System.out::println);
	}
	
	
	static boolean checkValueInList(List<Integer> list, int value) {
		
		return list.stream().anyMatch(i -> i.equals(value));
	}
	
	static <T> long checkCountofValueinList(List<T> T, Object obj) {
		
		return T.stream().filter(i -> i.equals(obj)).count();
	}
	
	static  void traverseHashMap(Map<Integer, String> hm) {
		
		hm.forEach((k,v) -> System.out.println("Key is " + k + " Value is " + v));
	}
	
	
	static Map<Integer, String> sortedMap(Map<Integer, String> map){
		
		return map.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2) -> e1,LinkedHashMap::new));
	}

	

}
