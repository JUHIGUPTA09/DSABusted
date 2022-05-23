package com.dsabusted.BitwiseOperator;

import java.util.Scanner;

public class OperatorDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number-1");
		int a=sc.nextInt();
		
		//left shift--Mutilplication by 2
		
		System.out.println(a<<1);
		
		//left shift
		
		System.out.println(a<<2);
		
		//rihght shift--division by 2
		
		System.out.println(a>>1);
		
		//right shift
		
		System.out.println(a>>2);
		

		
	}
}
