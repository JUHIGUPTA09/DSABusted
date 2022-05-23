package com.dsabusted.forLoop;

public class RoughWork {

	public static void main(String[] args) {
		reverse(-2136);

	}
	
	  public static int reverse(int x) {
	        if(x==0)
	        {
	            return 0;
	        }
	       long num=0;
	       System.out.println(x);
	        while(x!=0)
	        {
	            num=num*10+x%10;
	            x=x/10;
	            if(num>Integer.MAX_VALUE|| num<Integer.MIN_VALUE)
	        {
	             return 0;
	        }
	        }
	        System.out.println(num);
	        
	           
	        return (int) num;
	    }

}
