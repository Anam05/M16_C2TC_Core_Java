package com.tns.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add(123);
		s.add(null);
		System.out.println(s);

	}

}
