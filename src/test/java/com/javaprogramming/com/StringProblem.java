package com.javaprogramming.com;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.apache.commons.lang3.RandomUtils;

import com.javaprogramming.utility.Utility;

public class StringProblem {

	public static void main(String[] args) {

		String str = "aaabbccccddddddeeeeeeee";
		// output: a3b2c4 like this

		LinkedHashMap<Character, Integer> lhs = new LinkedHashMap<Character, Integer>();

		char[] arr = str.toCharArray();

		Function<LinkedHashMap<Character, Integer>, LinkedHashMap<Character, Integer>> f = e -> {

			for (Character c : arr)

				if (e.get(c) == null)

					e.put(c, 1);
				else
					e.put(c, e.get(c) + 1);

			return e;

		};

		f.apply(lhs);

		Consumer<LinkedHashMap<Character, Integer>> c = e -> {

			for (Entry<Character, Integer> l : lhs.entrySet()) {

				System.out.print(l.getKey() + "" + l.getValue());
			}

		};
		
		
		
		

		c.accept(lhs);

	}

}
