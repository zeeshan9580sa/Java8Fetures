package com.learning.Java8;

public class MyRunnable implements Runnable {
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Chlid thread before java 8");
		}
	}

}
