/**
 * 
 */
package com.prractice.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author d955012
 *
 */
public class SortMapBasedonValue2 {

	
	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(111, "nitya");
		hm.put(222, "abhay");
		hm.put(333, "zenet");
		hm.put(444, "biswa");
		hm.put(555, "viswa");
		
		
		Set<Entry<Integer, String>>entry=hm.entrySet();
		
		ArrayList<Entry<Integer, String>> mapList=new ArrayList<Map.Entry<Integer,String>>(entry);
		
		LinkedHashMap<Integer, String>sortedMap=mapList.stream().sorted((i,j)->i.getValue().compareTo(j.getValue())).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2)-> e1 + " , " + e2, LinkedHashMap::new));
		
		System.out.println(sortedMap);
		

	}

}
