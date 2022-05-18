package com.indiabix.generics;


public class GenericClass<T> {
	T val;
	//T val1;
	void print()
	{
		System.out.println(val.getClass());
		
		
	}
	/*void print1()
	{
		System.out.println(val1.getClass());
		
	}*/

	public static void main(String[] args) 
	{
		GenericClass<Integer> obj=new GenericClass<>();
		GenericClass<String> obj1=new GenericClass<>();
		obj.val=55;
		obj1.val="Akshay";
		obj.print();
		obj1.print();
		//obj1.print1();
		

	}

}