package com.dsabusted.Array.Intialization;

public class Scope {

	public static void main(String[] args) {
		int n=5;
		int[] a= {1,2,3};
		System.out.println("before fubction call ");
		System.out.println("n="+n);
		System.out.println("Array a=");
		for(int i:a)
		{
			System.out.println(i);
		}
		arryChange(a,n);
		System.out.println("after fubction call ");
		System.out.println("n="+n);
		System.out.println("Array a=");
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	public static void arryChange(int[] a,int n)
	{
		a[0]=5;
		a[2]=6;
		n++;
		System.out.println("in fubction call ");
		System.out.println("n="+n);
		System.out.println("Array a=");
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
