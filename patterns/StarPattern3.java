package com.dsabusted.patterns;

import java.util.Scanner;

public class StarPattern3 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i =1;
		while(i<=n)
		{
			int space=i-1;
			while(space>0)
			{
				System.out.print(" ");
				space--;
			}
			int j=n-i+1;
			while(j>0)
			{
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}
	
	}
}
