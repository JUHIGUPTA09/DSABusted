package com.dsabusted.forLoop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	int sum=0;
	System.out.print(a+" "+b);
	for(int i=0;i<n;i++)
	{
		sum=a+b;
		System.out.print(" "+sum);
		a=b;
		b=sum;
	}

	}

}
