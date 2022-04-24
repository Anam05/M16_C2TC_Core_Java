package com.indiabix.recurssion;
	 
	class Assigment_4_Recurssion {
	    static int numberOfPaths(int m, int n)
	    {  
	        if (m == 2 || n == 2)
	            return 1;     
	        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
	    }
	    public static void main(String args[])
	    {
	        System.out.println(numberOfPaths(3, 3));
	    }
	}
	 

