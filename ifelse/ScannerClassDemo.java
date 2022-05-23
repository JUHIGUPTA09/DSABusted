package com.dsabusted.ifelse;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println(name);
		System.out.println("Enter the address");
		String name1=sc.next();
		System.out.println(name1);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println(age);
		System.out.println("Enter the salary");
		Double sal=sc.nextDouble();
		System.out.println(sal);

	}

}
