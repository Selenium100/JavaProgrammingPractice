/**
 * 
 */
package com.prractice.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author d955012
 *
 */
public class Sample {
	
	
	public static void main(String[] args) {
		
		
		
		List<String> al=new ArrayList<String>();
		al.add("Nitya");
		al.add("Nitya");
		al.add("Nitya");
		al.add("Nitya");
		
		
		Set<String> hs=new HashSet<String>(al);
		
		System.out.println(hs);
		
		
		
	}
    
    

}
