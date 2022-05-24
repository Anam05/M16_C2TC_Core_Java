package com.tns.framework;

public abstract class NormalAcc extends ShopAccount {
	private final float deliveryCharges;
	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges)
	{
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	public void bookProduct(float charges)
	{
		System.out.print("Account no is "+this.getAccNo()+" Account name is: "
				+this.getAccNm()+""+"Charges is : "+(charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges,super.toString());
	}
	



}
