package com.dsabusted.BinaryToDecimal;

import java.util.Scanner;
import  java.lang.Math.*;

public class DecimarlToBinaryApp1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int bit=1;
		int num=0;
		int i=0;
		while(n!=0)
		{
			bit=n&1;
			n=n>>1;
			num=(int)(bit*Math.pow(10, i)+num);
			i++;
		}
		
		System.out.println(num);
	}


}
