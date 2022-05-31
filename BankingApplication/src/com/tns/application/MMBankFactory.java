package com.tns.application;

import com.tns.framework.BankFactory;

public class MMBankFactory extends BankFactory {

	@Override
	public MMSavingsAcc getNewSavingsACC(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingsAcc s=new MMSavingsAcc(accNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float MINBAL) {
		MMCurrentAcc c=new MMCurrentAcc(accNo, accNm, accBal, MINBAL);
		return c;
	}
	

}
