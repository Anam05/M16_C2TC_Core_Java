package com.tns.framework;


public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit)
	{
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	public void withdraw(float accBal)
	{
		System.out.print("Account no is: "+this.getAccNo()+" Account name is: "
				+this.getAccNm()+""+"accBal is : "+(creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [MINBAL=%s]", creditLimit,super.toString());
	}
	



}

	


