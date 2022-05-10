package com.tns.j_unittesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting5 {
	@Test
	void accept()
	{
		
	
	Assumptions.assumeFalse("Shaashank".equals(System.getProperty("2")));
	}
}
