package com.dsabusted.BinaryToDecimal;

import java.util.Scanner;
import  java.lang.Math.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int num=0;
		int rem=0;
		int i=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem==1)
			{
			num=(int) (num+Math.pow(2, i));
			}
			i++;
			n=n/10;
			
		}
		
System.out.println(num);
	}

}
