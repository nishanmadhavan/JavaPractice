package com.interview.programs;

import java.util.Scanner;

public class SwapValuesWithoutTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x = sc.nextInt();
		System.out.println("Enter the value of y : ");
		int y = sc.nextInt();

		x = x + y; // x=15
		y = x - y; // y=5
		x = x - y; // x=10

		System.out.println("Values after interchanging : " + x + " and " + y);

	}

}
