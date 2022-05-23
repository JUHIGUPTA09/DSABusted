package com.dsabusted.BinaryToDecimal;

import java.util.Scanner;
import  java.lang.Math.*;

public class DecimarlToBinaryNeg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int bit=1;
		int num=n;
		int i=0;
		
		while(num!=0)
		{
			n=n^bit;
			i++;
			bit=bit<<1;
			num=num>>>1;
		}
		n=n+1;
		System.out.println(n);
	}


}
