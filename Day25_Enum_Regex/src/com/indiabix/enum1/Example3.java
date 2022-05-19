package com.indiabix.enum1;
enum Bike
{
	Pulsar,KTM,R3,R15,Honda
}
public class Example3 {

	public static void main(String[] args) {
		Bike b=Bike.Honda;
		switch(b)
		{
		case Pulsar:
			System.out.println("cost rupees:65000");
			break;
		case KTM:
			System.out.println("cost rupees:90K");
			break;
		case R3:
			System.out.println("cost rupees:93K");
			break;
		case R15:
			System.out.println("cost rupees:1LAKHS");
			break;
			default:
				System.out.println("Invalid name");
		}

	}

}
