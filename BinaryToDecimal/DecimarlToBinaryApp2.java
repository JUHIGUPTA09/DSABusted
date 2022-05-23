package com.dsabusted.BinaryToDecimal;

import java.util.Scanner;
import  java.lang.Math.*;

public class DecimarlToBinaryApp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int rem=0;
		int num=0;
		double i=0;
		double d=10;
		while(n!=0)
		{
			rem=n%2;
			num=(int) ((rem*Math.pow(d,i))+num);
			i++;
			n=n/2;
		}
		System.out.println(num);

	}

}
