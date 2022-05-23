package com.dsabusted.ifelse;

import java.util.Scanner;

public class CompareTwoNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
	    System.out.println("Enter the first num:-");
	    int a=sc.nextInt();
	    System.out.println("Enter the second num:-");
	    int b=sc.nextInt();
	    if(a>b)
	    {
	    	System.out.println("A is greater than B");
	    }
	    else
	    {
	    	System.out.println("B is greater thn A");
	    }
	}

}
