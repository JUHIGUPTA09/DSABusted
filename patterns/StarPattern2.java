package com.dsabusted.patterns;

import java.util.Scanner;

public class StarPattern2 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
        while(i<=n)
        {
        	int space=n-i;
        	while(space>0)
        	{
        	 System.out.print(" ");	
        	 space--;
        	}
        	int j=1;
        	while(j<=i)
        	{
        		System.out.print("*");
        		j++;
        	}
        	System.out.println();
        	i++;
        }
	}
}
