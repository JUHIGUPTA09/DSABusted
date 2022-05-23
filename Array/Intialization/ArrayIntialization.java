package com.dsabusted.Array.Intialization;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntialization {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println(a[1]);
		System.out.println(a[4]);

		int[] b=  {1,2,3,4};
		System.out.println(b[2]);
	
		boolean[] booArray=new boolean[1];
	 
		int arr[]=new int[10];
		arr[0]=12;
		arr[1]=9;
		
		System.out.println("Printing the array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
