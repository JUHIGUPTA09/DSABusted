package com.dsabusted.whileloop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int i=2;
	boolean flag=false;
	while(i<n)
	{
		if(n%i==0)
		{
			flag=true;
			break;
		}
		i++;
	}
	
    if(flag)
    {
    	System.out.println("Not Prime");
    }
    else
    {
    	System.out.println("Prime");
    }
	}

}
