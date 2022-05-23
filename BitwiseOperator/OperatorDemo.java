package com.dsabusted.BitwiseOperator;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number-1");
		int a=sc.nextInt();
		System.out.println("Enter the number-2");
		int b=sc.nextInt();
		
		//and
		
		System.out.println(a&b);
		
		//or
		
		System.out.println(a|b);
		
		//xor
		System.out.println(a^b);
		
		System.out.println("Enter the number-3 fo negation");
		int c=sc.nextInt();
		//not
		System.out.println(~a);
		
	}
}
