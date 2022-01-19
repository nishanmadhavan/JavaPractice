package com.interview.programs;

import java.util.Scanner;

public class FibonacciSeries {
	static int n1 = 0;
	static int n2 = 1;
	static int n3, i;

	public static void main(String[] args) {

		System.out.println("Enter the number upto which you need to print Fibonacci Series");
		int number = new Scanner(System.in).nextInt();

		System.out.println("Fibonacci Series upto number " + number + " is : ");
		printFibonacciUsingRecursion(number);
//		for (i = 0; i < number; i++) {
//			n3 = n1 + n2; // 1 , 2 , 3 , 5, 8
//			System.out.println(n3);
//			n1 = n2; // 1 , 1 , 2 , 3
//			n2 = n3; // 1 , 2 , 3 , 5
//		}
	}

	static void printFibonacciUsingRecursion(int number) {
		for (i = 0; i < number; i++) {
			n3 = n1 + n2; // 1 , 2 , 3 , 5, 8
			System.out.println(n3);
			n1 = n2; // 1 , 1 , 2 , 3
			n2 = n3; // 1 , 2 , 3 , 5
		}
	}

}
