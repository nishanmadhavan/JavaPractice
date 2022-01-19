package com.mohana.qns;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class FindDuplicateElements {
	static int i, j;
	static List<Integer> list = new LinkedList<Integer>();
	static TreeSet<Integer> set = new TreeSet<Integer>();
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of elements to be in an array : ");
		int n = sc.nextInt();

		int[] array = new int[n];
		System.out.println("\nEnter the elemts of the array");
		for (i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		FindDuplicateElements obj = new FindDuplicateElements();
		obj.findDuplicateAndPutInList(array);
		obj.findFirstTwoMaxValues(array);
	}

	public void findDuplicateAndPutInList(int[] array) {
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					list.add(array[j]);
				}
			}
		}
		System.out.println("The duplicate Elements are : "+list);
	}
	
	public void findFirstTwoMaxValues(int[] array) {
		for(int v: array) {
			set.add(v);
		}
		System.out.println("\nThe two maximum number in the array are : "+set.pollLast() + " and "+ set.pollLast());
	}

}
