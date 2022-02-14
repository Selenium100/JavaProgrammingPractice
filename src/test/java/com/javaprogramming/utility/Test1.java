package com.javaprogramming.utility;

public class Test1 {
	
	
	public  void testing() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		
		Runnable r= new Test1()::testing;
			
			
			
			
			
		
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Main Thread");
		}
	}

}
