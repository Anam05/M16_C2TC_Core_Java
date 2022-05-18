package com.indibix.Lambda;
interface D
{
	int mul(int a,int b);
}
public class Example5 {

	public static void main(String[] args) {
		D obj=(int a,int b)->(a*b);
		{
			System.out.println("Multipication of a and b is "+obj.mul(20,10));
		};

	}

}
