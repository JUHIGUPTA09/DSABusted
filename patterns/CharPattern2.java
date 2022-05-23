package com.dsabusted.patterns;

import java.util.Scanner;

public class CharPattern2 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
        int i=1;
      
        while(i<=n)
        {
        	int j=1;
        	char c='A';
        	while(j<=n)
        	{
        		System.out.print(c);
        		c++;
        		j++;
        	}
        	System.out.println();
        	i++;
        }
	}
}
