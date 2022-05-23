package com.dsabusted.patterns;

import java.util.Scanner;

public class CharPattern6 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
        int i=1;
       while(i<=n)
       {
    	  char c=(char) ('A'+i-1);
    	  int j=1;
    	   while(j<=i)
    	   {
    		   System.out.print(c);
    		   j++;
    	   }
    	   System.out.println();
    	   i++;
       }
	}
}
