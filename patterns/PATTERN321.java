package com.dsabusted.patterns;

import java.util.Scanner;

public class PATTERN321 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int j=n;
		int i=1;
		while(i<=n)
		{
			while(j>=1)
			{
				System.out.print(j);
				j--;
			}
			j=n;
			System.out.println();
			i++;
		}
		
		
	}
}
