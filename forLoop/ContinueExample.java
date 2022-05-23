package com.dsabusted.forLoop;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int n=sc.nextInt();
	boolean flag =true;
	for(int i=0;i<n;i++)
	{
		System.out.println("Hi");
		System.out.println("Hello");
		if(i==2)
		{
			continue;
			
		}
		
		System.out.println("Welcome");

	}
	
	for(int i=0;i<=5;i++)
	{
		
	}

}
}
