package com.learning.Java8;

public class Test {
	public static void main(String[] args) {
		Interf i= ()-> System.out.println("Hello world by Lmbda Expression !!!!");
		i.m1();
		System.out.println("---------------------------------------------------------");
		System.out.println("We are going to inplement InterFZ add metthod"
				+ " and provide the Lambda expression implementation");
		System.out.println("----------------------------------------------------------");
		
		//InterFZ i1= (int a,int b)->System.out.println("The sum of given Number is   : "+a+b);
		InterFZ i1= (a, b)->System.out.println("The sum of given Number is   : "+(a+b));
		i1.add(4,5);
		System.out.println("-----------------------------------------------------------");
		Substraction s=( a, b)->System.out.println("Substraction of given number is : "+(a-b));
		s.sub(15,4); 
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Java & implemetation");
		System.out.println("-------------------------------------------------------------------");
		Java7Implementation d=new Java7Implementation();
		d.sub(23,15);
		
	}

}
