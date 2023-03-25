package com.mypackage;


import java.util.*;

public class AppMain {
	private static Scanner sc1;
	private static Scanner sc;

	public static void main(String[] args)
	{
		int a,b;
		sc = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		a= sc.nextInt();
		
		sc1 = new Scanner(System.in);
		System.out.println("Enter the number2: ");
		b = sc1.nextInt();
		
		Calculator c1 = new Calculator();
		
		int ans = c1.add(a,b);
		System.out.println("Addition is: "+ans);
		int ans1 =c1.subtract(a, b);
		System.out.println("Subtraction is: "+ans1);
		long ans2 = c1.multiply(a,b);
		System.out.println("Multiplication is: "+ans2);
		double ans3 =c1.divide(a, b);
		System.out.println("Division is: "+ans3);
	}
}
