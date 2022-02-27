/**
 * 
 */
package com.prractice.com;

import java.util.HashMap;
import java.util.Map;

public class CheckSum {

	
	public static void main(String[] args) {
		
		int[] arr= {4,6,10,5,3,8};
		int target=10;
		
		int[] get=printNumber(arr, target);
		System.out.println(get[0] + " " + get[1]);

	}
	
	public static int[] printNumber(int[] arr, int target) {
		
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			int delta=target-arr[i];
			
			hm.put(arr[i], i);
			
			if(hm.containsKey(delta)) {
				
				return new int[] {i,hm.get(delta)};
			}
			
		}
		return new int[] {-1,-1};

	}
}
