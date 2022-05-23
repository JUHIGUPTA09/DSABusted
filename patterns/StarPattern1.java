package com.dsabusted.patterns;

import java.util.Scanner;

public class StarPattern1 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
       while(n>=1)
       {
    	   int j=1;
    	   while(j<=n)
    	   {
    		   System.out.print("*");
    		   j++;
    	   }
    	   n--;
    	   System.out.println();
    	   
       }
	}
}
