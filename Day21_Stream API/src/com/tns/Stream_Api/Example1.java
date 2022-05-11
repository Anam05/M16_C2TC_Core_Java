package com.tns.Stream_Api;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,12,17,5,6);
		obj.stream().filter(i->i<20).forEach(i->System.out.println(i));

	}

}
