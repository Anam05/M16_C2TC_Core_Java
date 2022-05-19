package com.indiabix.enum1;
interface Pizza
{
	void display();
	
}
enum size implements Pizza
{
	regular,medium,large,extralarge;

	@Override
	public void display() {
		System.out.println("Size is:" +this);
		
	}
}
public class Example4 {

	public static void main(String[] args) {
		size.large.display();

	}

}
