package com.dsabusted.patterns;

import java.util.Scanner;

public class HardPattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			
			int firstTri=1;
			while(firstTri<=n-i+1)
			{
				System.out.print(firstTri);
				firstTri++;
			}
			
			int secondTri=(i-1)*2;
			while(secondTri>0)
			{
				System.out.print("*");
				secondTri--;
			}
			
			int thirdTri=n-i+1;
			while(thirdTri>0)
			{
				System.out.print(thirdTri);
				thirdTri--;
			}
			
		System.out.println();
		i++;
			
			
		}
		

	}

}
