package com.indiabix.wrapper;

public interface A {
	public void print();	
}
 class B implements A
{
	public void print()
	{
		System.out.println("hey guys welcome");
	}
	public static void main(String args[])
	{
		B obj=new B();
		obj.print();
	}
}

