package com.dsabusted.patterns;

import java.util.Scanner;

public class HardPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		int space=0;
		while(i<=n)
		{
			space=n-i;
			while(space>0)
			{
				System.out.print(" ");
				space--;
			}
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
			    j++;
			}
			int k=i-1;
			while(k>0)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
			i++;
			
		}

	}

}
