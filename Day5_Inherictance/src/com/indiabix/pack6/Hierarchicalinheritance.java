package com.indiabix.pack6;
class Vehicle
{
	void print()
	{
		System.out.println("Vehical Types");
	}
}
class Car extends Vehicle
{
	void display()
	{
		System.out.println("Mercedes-Benz");
	}
}
class Bike extends Vehicle
{
	void display()
	{
		System.out.println("Hayabooza");
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Bike b=new Bike();
		Car c=new Car();
		b.display();
		c.display();
		b.print();

	}

}
