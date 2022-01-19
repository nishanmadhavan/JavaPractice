package com.interview.programs;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which you want to check for palindrome : ");
		int num = s.nextInt();

		int r, temp, sum = 0;
		temp = num;
		while (num > 0) {
			r = num % 10; // 4 5 4
			sum = (sum * 10) + r; // 4 45 454
			num = num / 10; // 45 4
		}
		if (temp == sum) {
			System.out.println("The number " + temp + " is panlindrome");
		} else {
			System.out.println("The number " + temp + " is not panlindrome");
		}

	}

}
