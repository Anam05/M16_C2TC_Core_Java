package com.tns.collection;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Example5 {

	public static void main(String[] args) {
		NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
		s.put(11, null);
		s.put(12, "anam");
		//s.remove(11);
		System.out.println(s);
		System.out.println(s.firstEntry());

	}

}
