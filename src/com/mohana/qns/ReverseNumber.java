package com.mohana.qns;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		ReverseNumber obj = new ReverseNumber();
		obj.reverseTheNumber(num);
	}

	public void reverseTheNumber(int num) {
		int r, reverseNum=0;
		while(num>0) {
			r = num % 10;
			reverseNum = (reverseNum * 10) + r;
			num=num/10;
		}
		System.out.println("The reverse of the number is : " + reverseNum);

	}
	

}
