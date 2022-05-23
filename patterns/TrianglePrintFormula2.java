package com.dsabusted.patterns;

import java.util.Scanner;

public class TrianglePrintFormula2 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=i;
			while(j<i*2)
			{
				System.out.print(j +" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
