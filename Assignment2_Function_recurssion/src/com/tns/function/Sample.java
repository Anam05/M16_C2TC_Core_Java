package com.tns.function;
import java.util.Scanner;
public class Sample {
	static int NthFibonacciNumber(int n)
	{
	    if(n==0)
	        return 0;
	    else if(n==1)
	        return 1;
	    else
	        return NthFibonacciNumber(n-1)+NthFibonacciNumber(n-2);
	}
	public static void main(String[] args) {
           Scanner cs=new Scanner(System.in);
            int n;
		    System.out.print("Enter the N value:");
		    n=cs.nextInt();
		    System.out.print("Nth Fibonacci Number is: "+NthFibonacciNumber(n));
	        cs.close();
		}
	}

