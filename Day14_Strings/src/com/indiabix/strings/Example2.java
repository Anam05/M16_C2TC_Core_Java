package com.indiabix.strings;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1 =(s.nextLine());
		String str2 =(s.nextLine());
		System.out.println(str1.equals(str2));
		s.close();

	}

}
