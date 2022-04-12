package com.indiabix.pack5;

class A
{
	public double var=10;
	public int add(int a,int b)
	{
		return a+b;
	}
}
public class B {
	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.var);
		System.out.println(obj.add(10,20));
		
	}

}
