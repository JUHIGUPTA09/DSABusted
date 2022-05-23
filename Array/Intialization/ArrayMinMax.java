package com.dsabusted.Array.Intialization;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter the number in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}

		System.out.println("Calculating max and min value in array");
		int min=a[0];
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];;
			}
		}
		
		System.out.println("max number in array= "+max+"min number in array= "+min);
	}

}
