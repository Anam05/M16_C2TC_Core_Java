package com.indiabix.exception;
//Pipe(1)
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		String[] s = {"abc", "123", null, "xyz"};
		for(int i=0;i<5;i++)
		{
			try
			{
				int a=s[i].length() + Integer.parseInt(s[i]);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);

		}
		
			catch(NullPointerException e1)
			{
				System.out.println(e1);
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println(ex);

			}

		}

	}

}
