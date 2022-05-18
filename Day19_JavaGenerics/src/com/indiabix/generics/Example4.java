package com.indiabix.generics;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		Map<Integer,Integer>obj=new HashMap<Integer,Integer>();
		obj.put(1,123);
		obj.put(5, 456);
		System.out.println(obj);
		Set<Entry<Integer,Integer>>obj1=obj.entrySet();
		Iterator<Map.Entry<Integer,Integer>>itr=obj1.iterator();
		while(itr.hasNext())
		{
			
			@SuppressWarnings("rawtypes")
			Map.Entry e1=itr.next();
			System.out.println(e1.getKey()+" " +e1.getValue());
		}

	}

}