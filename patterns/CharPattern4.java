package com.dsabusted.patterns;

import java.util.Scanner;

public class CharPattern4 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
        int i=1;
        char c='A';
 
        while(i<=n)
        {
        	char ch=c;
            int j=1;
        	while(j<=n)
        	{
        		System.out.print(ch);
        		ch++;
        		j++;
        	}
        	System.out.println();
        	c++;
        	i++;
        }
	}
}
