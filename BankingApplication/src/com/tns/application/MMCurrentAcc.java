package com.tns.application;

import com.tns.framework.CurrentAcc;


public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float MINBAL) {
		super(accNo, accNm, accBal, MINBAL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMCurrentAcc [toString()=%s]", super.toString());
	}
	

}
