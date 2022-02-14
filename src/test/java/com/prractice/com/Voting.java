/**
 * 
 */
package com.prractice.com;

import java.util.function.Function;
import java.util.function.Predicate;

import com.javaprogramming.utility.UnderAgedException;

/**
 * @author d955012
 *
 */
public class Voting {

	
	public static void main(String[] args)  {
		
		int i=17;
		
		if(i<18) {
			
			try {
				throw new UnderAgedException();
			} catch (UnderAgedException e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.println("You can Vote");
		}
		
		
		System.out.println("eewwfw");

	}

}
