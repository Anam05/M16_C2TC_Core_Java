package com.indiabix.pack6;
class Parent
{
	void print()
	{
		System.out.println("Hello,what;s going");
	}
}
class Child extends Parent
{
	void display()
	{
	System.out.println("Child class");
}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c =new Child();
		c.display();
	}

}
