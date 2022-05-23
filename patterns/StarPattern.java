package com.dsabusted.patterns;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		//While
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=sc.nextInt();
		int i=0;
		while(i<n)
		{
			int j=0;
			while(j<n)
			{
				System.out.print("*");
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
