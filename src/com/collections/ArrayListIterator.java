package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Nishan");
		list.add("Kalaivani");
		list.add("Swetha");

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(10);
		numList.add(100);
		System.out.println("Traversing through for loop\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// prints in reverse direction
		System.out.println("\nTraversing through List Iterator\n");
		ListIterator<String> ite = list.listIterator(list.size());
		while (ite.hasPrevious()) {
			System.out.println(ite.previous());
		}

		// prints in forward direction
		System.out.println("\nTraversing through Forward List Iterator\n");
		do {
			System.out.println(ite.next());
		} while (ite.hasNext());

		
		//for integer
		System.out.println("\nTraversing through reverse List Iterator for Integer\n");
		ListIterator<Integer> numIterator = numList.listIterator(numList.size());
		while (numIterator.hasPrevious()) {
			System.out.println(numIterator.previous());
		}

	}

}
