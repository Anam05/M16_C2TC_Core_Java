
package com.indiabix.generics;

public class GenericMethod 
{
	public static <E>void display(E[] arr)
	{
		for(E itr:arr)
		{
			System.out.println(itr);
		}
		System.out.println();
		
	}

	public static void main(String[] args)
	{
		Integer[] a= {11,22,33};
		Character[] b={'x','z'};
		display(a);
		display(b);
		
		

	}

}