package com.indiabix.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example5 {

	public static void main(String[] args) {
		//String x="16-05-2022 03:52";
		//DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:MM");
		
		LocalDateTime l= LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:MM");
		String x=l.format(df);
		System.out.println(x);
		

	}

}
