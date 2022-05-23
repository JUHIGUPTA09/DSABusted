package com.dsabusted.Array.Intialization;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int[] a= new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}

		System.out.println("sum="+sum);
	}

}
