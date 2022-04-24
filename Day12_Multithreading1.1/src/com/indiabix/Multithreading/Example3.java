package com.indiabix.Multithreading;

public class Example3 {

		public static void main(String[] args) {
			Thread t= Thread.currentThread();
			System.out.println("Current Thread: "+t);
			t.setName("Priya");
			t.setPriority(9);
			System.out.println("Current Thread: "+t);
			try
			{
				Thread.sleep(1);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}

		}



	}


