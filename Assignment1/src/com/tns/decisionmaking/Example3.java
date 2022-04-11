package com.tns.decisionmaking;

public class Example3 {

	public static void main(String[] args) {
		int age=15,weight=130;
		//nested if
		if(age>=12)
		{
			if(weight>=40)
		
			{
			if(weight<=110)
			{
				System.out.println("eligible to bunjee jumping");
			}
			else
			{
				System.out.println("extra ropes will be added");		
			}
		}
		else
		{
		System.out.println("Not eligible to bunjee jumping");
	}
		}
		else
		{
			System.out.println("eligible to bunjee jumping");

		}

}
}
