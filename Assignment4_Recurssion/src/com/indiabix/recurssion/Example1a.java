package com.indiabix.recurssion;

public class Example1a {
	static int person1(int n, int k)
	{
		if (n == 1)
			return 1;
		else
			
			return (person1(n - 1, k) + k - 1) % n + 1;
	}
		
	public static void main(String[] args)
	{
		int n = 5;
		int k = 2;
		System.out.println("The chosen place is "
						+ person1(n, k));
	}
}

