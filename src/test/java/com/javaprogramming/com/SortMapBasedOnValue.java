
package com.javaprogramming.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;


public class SortMapBasedOnValue {

	
	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(100, "nitya");
		hm.put(200, "abhay");
		hm.put(300, "bikash");
		hm.put(400, "rudra");
		hm.put(500, "viswa");
		
		
		Set<Entry<Integer, String>>entry=hm.entrySet();
		
		ArrayList<Entry<Integer, String>> list=new ArrayList<Map.Entry<Integer,String>>(entry);
		
		LinkedHashMap<Integer, String>sortedMap=list.stream().sorted((i,j) -> i.getValue().compareTo(j.getValue())).collect(Collectors.toMap(Entry<Integer, String>::getKey, Entry<Integer, String>::getValue, (e1,e2)-> e1 + " , " + e2, LinkedHashMap::new));
        
		
		System.out.println(sortedMap);
		
		
		
	}

}
