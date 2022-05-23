package com.dsabusted.whileloop;

import java.util.Scanner;

public class Print1To5 {

	public static void main(String[] args) {
		//Two APpproaches from while and for loop
		
		//While
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the num");
        int n=sc.nextInt();
        int i=1;
/*        while(i<=n)
        {
        	System.out.println(i);
        	i++;
        }*/
        
        for(int j=1;j<=n;j++)
        {
        	System.out.println(j);
        }
        
        
	}

}
