package com.indiabix.collecton;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		System.out.println(l.isEmpty());
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l.add(1);
		l.add(12);
		l.add(15);
		l.add(20);
		l.add(134);
		l.addFirst(2);

		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains(15));
		System.out.println(l.indexOf(l));
		System.out.println(l.lastIndexOf(l));
		System.out.println(l.get(2));
		l.set(4, 23);
		System.out.println(l);
		System.out.println(l.isEmpty());

	}

}
