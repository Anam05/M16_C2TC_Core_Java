package com.indiabix.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Programming");
		Matcher m=p.matcher("Java Programming is enough to get a job in IT Industry");
		while(m.find())
		{
			System.out.printf("Pattern found from : " +m.start() + " to " +(m.end()-1));
		}

	}

}
