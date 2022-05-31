package com.tns.framework;

public abstract class SavingsAcc extends BankAcc {
	
	private boolean isSalaried;
		static final private float MINBAL=2500;
		public SavingsAcc(int accNo, String accNm, float accBal,boolean isSalaried) 
		{
			super(accNo, accNm, accBal);
			this.isSalaried=isSalaried;
		}

			public void withdraw(float accBal)
			{
			System.out.println("Account no is "+this.getAccNo()+" Account name is: "
					+this.getAccNm()+" "+" accBal is : "+accBal);

			}

			@Override
			public String toString() {
				return String.format("SavingsAcc [isSalaried=%s]", isSalaried,super.toString());
			}
			

			


		
		

	}



