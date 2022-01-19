package com.interview.programs;

import java.util.Scanner;

public class CheckPrimeNumber {
	static int i, m = 0, flag = 0;

	public static void main(String[] args) {
		System.out.println("Enter the number for which you want to check for prime number : ");
		int num = new Scanner(System.in).nextInt();
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		} else {
			for (i = 2; i < m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = 1;
					break;	
				}
			}
		}

		if (flag == 0)
			System.out.println(num + " is a prime number");
	}
}
