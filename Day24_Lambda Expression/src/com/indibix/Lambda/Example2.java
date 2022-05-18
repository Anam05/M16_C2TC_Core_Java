package com.indibix.Lambda;
interface B
{
	String display(String str);
}
public class Example2 {

	public static void main(String[] args) {
		//Lambda expression with return statement 
		//Lambda Expression with single parameter
		B obj=(String str)->
		{
			return str;
		};
			System.out.println(obj.display("Lambda Expression with one/single parameter"));
		};

	}


