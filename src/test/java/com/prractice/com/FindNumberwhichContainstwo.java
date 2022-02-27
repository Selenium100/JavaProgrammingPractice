/**
 * 
 */
package com.prractice.com;


public class FindNumberwhichContainstwo {

	
	public static void main(String[] args) {
		
		int[] arr= {2,22,34,43,42,52,60};
		int expected=2;
		
		
		findNumber(arr, expected);

	}
	
	
	public static void  findNumber(int[] arr, int expected) {
		
		
		for(int i=0;i<arr.length;i++) {
			
			String convertedString=String.valueOf(arr[i]);
			if(convertedString.contains(Integer.toString(expected))){
				
				System.out.print(arr[i] + " ");
			}
		}
		
		
	}

}
