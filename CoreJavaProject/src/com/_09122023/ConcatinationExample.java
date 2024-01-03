package com._09122023;

public class ConcatinationExample {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int c=a+b;
		System.out.println("c value>>"+c);
		System.out.println("sum value>>"+(a+b));
		
		String s="data";
		
		String res=a+b+s;
		System.out.println("res>>>"+res);  //30data
		
		String res1=s+a+b;
		System.out.println("res1>>>>"+res);  //data1020
		
	}

}
