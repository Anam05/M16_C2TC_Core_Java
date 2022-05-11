package com.tns.Stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,12,17,5,6);
		List<Integer>obj2=obj.stream().map(i->i*i).collect(Collectors.toList());
		obj.stream().distinct().forEach(System.out::println);
		System.out.println(obj2);
		

	}

}
