package com.indiabix.scanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int a=s.nextInt();
	double b=s.nextDouble();
	String str=s.next();
	System.out.println(a);
	System.out.println(b);
	System.out.println(str);
	s.close();
	
	}

}
