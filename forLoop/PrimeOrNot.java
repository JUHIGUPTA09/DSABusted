package com.dsabusted.forLoop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int n=sc.nextInt();
	boolean flag =true;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag)
	{
		System.out.println("Number is Prime");
	}
	else
	{
		System.out.println("Number is not Prime");
	}

	}

}
