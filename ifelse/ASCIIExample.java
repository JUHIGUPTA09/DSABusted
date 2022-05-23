package com.dsabusted.ifelse;

import java.util.Scanner;

public class ASCIIExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println("Lowercase");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Uppercase");
		}
		else if(ch>='0' && ch<='9' )
		{
		System.out.println("Number");	
		}

	}

}
