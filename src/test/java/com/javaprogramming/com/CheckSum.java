/**
 * 
 */
package com.javaprogramming.com;

import java.util.HashMap;
import java.util.Map;

public class CheckSum {

	
	public static void main(String[] args) {
		
		int[] arr= {6,7,3,4,2,0};
		int sum=6;
		
		int[] arr1=printSumNumber(arr, sum);
		System.out.println(arr1[0] + " " + arr1[1]);

	}
	
	public static int[] printSumNumber(int[] arr,int sum) {
		
		Map<Integer, Integer> visited=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			
			int delta=sum-arr[i]; //
			
			if(visited.containsKey(delta)) {
				
				return new int[] {i,visited.get(delta)};
			}
				
				visited.put(arr[i], i);
			
		}
		return new int[] {-1,-1};
		
	}

}
