package com.dsabusted.Miscellaneous;

import java.util.Scanner;

public class FarnToCelicus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the temp in fahrenheit");
		double c=0.0;
		double f=sc.nextDouble();
		if(f>0.0)
		{
			c=(5.0/9)*(f-32);
		}
		
		System.out.println(c);

	}

}
