package com.mohana.qns;

import java.util.Scanner;

public class RemoveSpacesFromString {
	public static void main(String[] args) {
		System.out.println("Enter the string with spaces : ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();

		System.out.println("Method 1 output : "+string.replaceAll("\\s", "")); //method 1
		
		RemoveSpacesFromString obj = new RemoveSpacesFromString(); //method 2
		obj.removeString(string);

	}

	public void removeString(String string) {
		char[] strArray = string.toCharArray();
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if((strArray[i]!= ' ') && (strArray[i]!='\t')){
				str.append(strArray[i]);
			}
		}
		System.out.println("Method 2 output : "+str);
	}
}
