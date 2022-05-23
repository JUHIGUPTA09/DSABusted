package com.dsabusted.Array.Intialization;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value in Array");
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Enter the number to be found");
		int num=sc.nextInt();
		
		for(int i:a)
		{
			if(i==num)
			{
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
		System.out.println("Num is present");
	     }
		else
		{
			System.out.println("Num is abesent");
		}
	}
	

}
