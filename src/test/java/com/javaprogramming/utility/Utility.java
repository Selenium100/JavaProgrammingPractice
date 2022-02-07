package com.javaprogramming.utility;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

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

}
