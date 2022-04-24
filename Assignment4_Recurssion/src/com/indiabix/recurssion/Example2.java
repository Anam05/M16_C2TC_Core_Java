package com.indiabix.recurssion;
	 
public class Example2  {
	    static int numberOfPaths(int m, int n)
	    {  
	        if (m == 2 || n == 3)
	            return 1;     
	        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
	    }
	    public static void main(String args[])
	    {
	        System.out.println(numberOfPaths(4, 4));
	    }
	}
	 




