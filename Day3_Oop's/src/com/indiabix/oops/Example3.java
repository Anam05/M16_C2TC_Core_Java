package com.indiabix.oops;

public class Example3 {
	
		  String languages;

		  // constructor accepting single value
		  Example3(String lang) {
		    languages = lang;
		    System.out.println(languages + " Programming Language");
		  }

		  public static void main(String[] args) {

		    // call constructor by passing a single value
			  Example3 obj1 = new Example3("Java");
			  Example3 obj2 = new Example3("Python");
			  Example3 obj3= new Example3("C");
		  }
		}


