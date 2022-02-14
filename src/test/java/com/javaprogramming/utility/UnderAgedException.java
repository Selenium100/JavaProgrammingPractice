/**
 * 
 */
package com.javaprogramming.utility;

/**
 * @author d955012
 *
 */
@SuppressWarnings("serial")
public class UnderAgedException extends Exception {

	public UnderAgedException() {

		super("You are under Aged to give vote");
	}

	public UnderAgedException(String message) {

		super(message);
	}

}
