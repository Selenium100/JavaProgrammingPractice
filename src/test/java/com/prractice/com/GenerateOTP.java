package com.prractice.com;

import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class GenerateOTP {

	public static void main(String[] args) {
		
		Supplier<String> s= () -> {
			
			String OTP="";
			for(int i=0;i<6;i++) 
				
				 OTP=OTP+(int)(Math.random()*10);
				 return OTP;
				 
			
			
		};
		
		
		System.out.println(s.get());

	}

}
