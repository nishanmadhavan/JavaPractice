package com.interview.programs;

import java.util.Scanner;

public class StringAndNumberPalindrome {
	public static void main(String[] args) {
		String original, reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number/String you want to check for");
		original = s.nextLine();

		int length = original.length() - 1;
		for (int i = length; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
			System.out.println(reverse);
		}

		if (original.equals(reverse)) {
			System.out.println("The given element " + original + " is a palindrome");
		} else {
			System.out.println("The given element " + original + " is not a palindrome");
		}

	}
}
