package com.dsabusted.patterns;

import java.util.Scanner;

public class CountPrint {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=1;
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(count+" " );
				count++;
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
	}
}
