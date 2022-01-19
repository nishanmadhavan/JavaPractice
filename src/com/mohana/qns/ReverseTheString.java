package com.mohana.qns;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ReverseTheString obj = new ReverseTheString();
		obj.reverseUsingIteration(str);
		obj.reverseUsingStringBuilder(str);
	}
	
	private void reverseUsingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
	}

	public void reverseUsingIteration(String str) {
		char[] word = str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		System.out.println(word.length);
		for (int i = word.length-1 ; i >=0; i--) {
			buffer.append(word[i]);
		}
		System.out.println(buffer);
	}

}
