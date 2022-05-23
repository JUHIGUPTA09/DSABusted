package com.dsabusted.whileloop;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		//Two APpproaches from while and for loop
		
		//While
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the num");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
//        while(i<=n)
//        {
//        	sum=sum+i;
//        	i++;
//        }
       
        
     for(int j=1;j<=n;j++)
        {
        	sum=sum+j;
        }
      
        System.out.println(sum);
	}

}
