package com.indiabix.multithreading;
class Parent1 extends Thread
{
	public void run()
	{
		
		try {
			Thread.sleep(1);
			System.out.println("C2TC program");
		} catch (InterruptedException e) {
			System.out.println("Exception Occurred");

			
		}
	}
}


public class Example2 {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.start();
		p.interrupt();
		

	}

}
