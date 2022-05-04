package com.tns.collection;

import java.util.ArrayDeque;

public class Example2 {

	public static void main(String[] args) {
		ArrayDeque  a=new ArrayDeque ();
		a.add("Hello");
		a.add(12);
		System.out.println(a);
		a.addFirst(12);
		a.addFirst("World");
		System.out.println(a);

	}

}
