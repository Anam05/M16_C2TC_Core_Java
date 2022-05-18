package com.indibix.Lambda;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(55);
		obj.add(13);
		obj.add(23);
		System.out.println(obj);
		obj.forEach((n)->
		{
			System.out.println(n);
			
		});
		

	}

}
