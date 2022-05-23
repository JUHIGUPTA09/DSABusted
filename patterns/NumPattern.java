package com.dsabusted.patterns;

import java.util.Scanner;

public class NumPattern {

	public static void main(String[] args) {
		//While
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(1);
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=sc.nextInt();
		//ForLoop
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
*/
	}

}
