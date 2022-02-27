package com.javaprogramming.com;

import java.util.LinkedHashMap;



public class CharacterOccurance {

	public static void main(String[] args) {

		String word = "Nityaisagoodboy";

		char[] charArr = word.toCharArray();

		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (Character eachChar : charArr) {

			if (lhm.get(eachChar) == null) {

				lhm.put(eachChar, 1);
			} else {

				lhm.put(eachChar, lhm.get(eachChar) + 1);
			}

		}

		lhm.entrySet().stream().forEach(System.out::println);

		

	}

}
