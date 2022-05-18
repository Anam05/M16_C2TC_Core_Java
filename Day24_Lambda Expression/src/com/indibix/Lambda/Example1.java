package com.indibix.Lambda;
interface A
{
	void show();//Functional interface which contains only 1 abstract method
}
/*class B implements A
{
	public void show()
	{
		System.out.println("Functional Interface");
	}
}
*/
public class Example1 {

	public static void main(String[] args) {
		//L
		A obj =()->
		{
			System.out.println("Functional Interface");

		};
		obj.show();

	}

}
