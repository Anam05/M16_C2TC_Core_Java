package com.tns.application;

import com.tns.framework.SavingsAcc;

public class MMSavingsAcc extends SavingsAcc 
{

	public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMSavingsAcc [toString()=%s]", super.toString());
	}
	
	

}
