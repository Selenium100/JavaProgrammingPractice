/**
 * 
 */
package com.javaprogramming.com;

import java.util.LinkedHashMap;

/**
 * @author d955012
 *
 */
public class FrequencyOfCharacter {

	
	public static void main(String[] args) {
		
		String str="aaa bbdcfarf";
		
		char[] c=str.toCharArray();
		
		LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<Character, Integer>();
		
		for(Character each:c) {
			
			if(lhm.get(each)==null) {
				
				lhm.put(each, 1);
			}else
			{
				
				lhm.put(each, lhm.get(each)+1);
			}
			
		}
		
		lhm.entrySet().stream().forEach(System.out::println);

	}

}
