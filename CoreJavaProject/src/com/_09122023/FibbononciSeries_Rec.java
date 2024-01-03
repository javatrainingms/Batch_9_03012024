package com._09122023;

public class FibbononciSeries_Rec {
	static int start=0;
	static int end=10;
	static int n1=0;
	static int n2=1;
	static int n3=0;
	
	public static void main(String[] args) {
		System.out.print(n1+" "+n2+" ");
		rec();	
	}
	
	public static void rec()
	{
		if(start <=end)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			
			n1=n2;
			n2=n3;
			
			
			start++;
			rec();
		}
	}

}
