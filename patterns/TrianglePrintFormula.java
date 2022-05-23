package com.dsabusted.patterns;

import java.util.Scanner;

public class TrianglePrintFormula {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		int num=0;
		while(i<=n)
		{
			num=i;
			int j=1;
			while(j<=i)
			{
				System.out.print(num +" ");
				num++;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
