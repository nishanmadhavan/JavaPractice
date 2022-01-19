package com.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Nishan");
		ll.add("Kalaivani");
		ll.add("Swetha");
		ll.add("Person_one");
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Virat");
		ll.add("Vijay");
		ll.add("Ajay");

		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("list2_One");
		ll2.add("List2_Two");

		// Initial List of elements
		System.out.println("Initial List of Elements: \n" + ll);

		// List of elements after addition:
		ll.addAll(ll2);
		System.out.println("\nAfter adding list two : \n" + ll);

		// Removing list two
		ll.removeAll(ll2);
		System.out.println("\nAfter removing list two : \n" + ll);

		// Removing First Occurrence
		ll.removeFirstOccurrence("Vijay");
		System.out.println("\nRemoving first occurrence of vijay : \n" + ll);

		// Removing First Occurrence
		ll.removeLastOccurrence("Ajay");
		System.out.println("\nRemoving first occurrence of Ajay : \n" + ll);
		
		// For more methods refer : https://www.javatpoint.com/java-linkedlist
		
		Collections.sort(ll);
		System.out.println(ll);

	}

}
