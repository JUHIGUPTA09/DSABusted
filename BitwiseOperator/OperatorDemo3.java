package com.dsabusted.BitwiseOperator;

import java.util.Scanner;

public class OperatorDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number-1");
		int i=sc.nextInt();
		
		//left shift--Mutilplication by 2
		
		System.out.println(++i);
		
		//left shift
		
		System.out.println(i++);
		
		//rihght shift--division by 2
		
		System.out.println(--i);
		
		//right shift
		
		System.out.println(i--);
		

		
	}
}
