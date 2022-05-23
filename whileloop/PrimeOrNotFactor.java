package com.dsabusted.whileloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeOrNotFactor {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int i=1;
	boolean flag=false;
	List<Integer> l=new ArrayList<>();
	while(i<=n)
	{
		if(n%i==0)
		{
			l.add(i);
		}
		i++;
	}
	
System.out.println(l);
	}

}
