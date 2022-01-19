package com.mohana.qns;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class SortListOfStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Strings you'd like to enter");
		int n = sc.nextInt();
		String[] array = new String[n];
		System.out.println("The length is : " + array.length);
		System.out.println("\nEnter the Strings : ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		SortListOfStrings obj = new SortListOfStrings();
		obj.sortByCollectionsMethod(array);
		obj.sortByTreeSet(array);

	}

	public void sortByCollectionsMethod(String[] array) {
		List<String> list = new LinkedList<String>(Arrays.asList(array));
		Collections.sort(list);
		System.out.println(list);
	}

	public void sortByTreeSet(String[] array) {
		TreeSet<String> treeSet = new TreeSet<String>(Arrays.asList(array));
		System.out.println(treeSet);
	}

}
