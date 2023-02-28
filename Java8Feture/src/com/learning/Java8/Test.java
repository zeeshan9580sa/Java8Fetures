package com.learning.Java8;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		//Lamda expression implementation
		Interf i= ()-> System.out.println("----------------Lamda Expression Implemetation--------------");
		//calling the method
		i.m1();
		System.out.println("---------------------------------------------------------");
		System.out.println("We are going to inplement InterFZ add metthod"
				+ " and provide the Lambda expression implementation");
		System.out.println("----------------------------------------------------------");
		
		//InterFZ i1= (int a,int b)->System.out.println("The sum of given Number is   : "+a+b);
		//Lamda expression implementation
		InterFZ i1= (a, b)->System.out.println("The sum of given Number is   : "+(a+b));
		//calling the method
		i1.add(4,5);
		System.out.println("-----------------------------------------------------------");
		//Lamda expression implementation
		Substraction s=( a, b)->System.out.println("Substraction of given number is : "+(a-b));
		//calling the method
		s.sub(15,4); 
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Java & implemetation");
		System.out.println("-------------------------------------------------------------------");
		Java7Implementation d=new Java7Implementation();
		d.sub(23,15);
		
		System.out.println("----------------------Lamda Expression Implemetation----------------");
		//Lamda expression implementation
		InterfSq squareOf=(n)->n*n;
		//calling the method
		System.out.println(squareOf.squiIt(5));
		System.out.println("Before java 8 runable interface implemation");
		MyRunnable mr=new MyRunnable();
		Thread t =new Thread(mr);
		t.start();
		for (int j=2;j<=10;j++)
		{
			System.out.println("beffore Java 8Parent thread");
		}
		
		System.out.println("-------------------------Java 8 for thread----------------");
		Runnable r8=()->{
			for (int j = 5; j<=10; j++) {
				System.out.println(" child thread After java 8 implemetation");
				}
		};
		Thread t2= new Thread(r8);
		t2.start();
		for(int i3=1;i3<=10;i3++)
		{
			System.out.println("parante thread after Java 8 implemetation" );
		}
		
	}

}
