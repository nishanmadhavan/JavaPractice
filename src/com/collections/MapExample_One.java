package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample_One {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1000, "Swetha");
		map.put(200, "Kalaivani");
		map.put(300, "Nishan");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		// can be sort by key or value -  both ascending and descending
		// refer https://www.javatpoint.com/java-map for more methods
	}

}
