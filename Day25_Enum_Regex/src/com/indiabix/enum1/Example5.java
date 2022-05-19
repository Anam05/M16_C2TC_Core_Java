package com.indiabix.enum1;


public class Example5 {
	enum EmpType
	{
		Contract,Permanent,Temporary;
	}
	static void print(EmpType e)
	{
		if(e==EmpType.Permanent)
		{
			System.out.println("Permanent Employee");
		}
		else if(e==EmpType.Temporary)
		{
			System.out.println("Temporary Employee");
		}
	}

	public static void main(String[] args) {
		EmpType e=EmpType.Temporary;
		print(e);

	}

}
