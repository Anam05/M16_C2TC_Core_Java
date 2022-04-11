package com.tns.assignment;

public class Assignment2 {

	public static void 
		pyramidpattern(int n)
		{
		for(int i=0;i<n;i++)
			//for number of rows
		{
			for(int j=n-1;j>1;j--)
			{
				System.out.print("");
				
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			
			}
			System.out.println("");
		}
	}
public static void main(String args[]) {
	int n=8;
	pyramidpattern(n);
}
}
