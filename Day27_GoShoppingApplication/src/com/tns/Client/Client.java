package com.tns.Client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopfactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopfactory();
		PrimeAcc p=new GSPrimeAcc(101, "ANAM",500,true);
		NormalAcc n=new GSNormalAcc(182,"Shagufta ",600,50);
		System.out.println("Prime Account");
		p.bookProduct(p.getCharges());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		

	}

}
