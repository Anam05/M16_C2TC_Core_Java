package com.tns.AccountHolder;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingsAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingsAcc;

public class AccountHolder {

	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingsAcc s=new MMSavingsAcc(111,"Shagufta",500000,true);
		CurrentAcc c=new MMCurrentAcc(112,"ANAM", 60000,100000);
		System.out.println("Savings Account");
		s.withdraw(s.getaccBal());
		System.out.println("Current Account");
		c.withdraw(c.getAccNo());
		
		
		
		

	}

}
