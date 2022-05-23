package com.dsabusted.ifelse;

import java.util.Scanner;

public class NumNegaOrPos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer");
		int num=sc.nextInt();
		if(num>0) 
		{
			System.out.println("num is +ve");
		}
		else if(num<0)
		{
			System.out.println("num is -ve");
		}
		else
		{
			System.out.println("num is zero");
		}
	}

}
