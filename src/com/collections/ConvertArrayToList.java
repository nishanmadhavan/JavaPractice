package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		String[] array = { "Nishan", "Kalaivani", "Swetha" };
		
		System.out.println("Printing the array : "+Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		
		for(String names:array) {
			list.add(names);
		}
		System.out.println("The list output is : "+list);
	}

}
