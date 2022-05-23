package com.dsabusted.patterns;

import java.util.Scanner;

public class CountPrintReverse {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=n*n;
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(count+" " );
				count--;
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
	}
}
