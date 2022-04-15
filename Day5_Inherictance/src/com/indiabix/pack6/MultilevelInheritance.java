package com.indiabix.pack6;
class Samsung
{
	void accept()
	{
		System.out.println("Samsung galaxy");
	}
}
class SamsungM31 extends Samsung
{
	void print()
	{
		System.out.println("Samsung Galaxy-M31");
	}
}
class SamsungM31s extends SamsungM31
{

	void display()
	{
		System.out.println("Samsung Galaxy-M31s");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		SamsungM31s obj=new SamsungM31s();
		obj.accept();
		obj.print();
		obj.display();
	}
		
	}


