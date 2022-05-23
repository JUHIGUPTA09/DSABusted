package com.dsabusted.whileloop;

import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=num)
        	
        {
        	if(i%2==0)
        	{
        		sum=sum+i;
 
        	}
        i++;
        }
        System.out.println(sum);
	}

}
