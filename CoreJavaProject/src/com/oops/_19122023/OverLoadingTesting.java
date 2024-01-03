package com.oops._19122023;

public class OverLoadingTesting {
	
	public static void main(String[] args) {
		OverLoadingExample o=new OverLoadingExample();
		System.out.println(o.sum(20, 30));
		System.out.println(o.sum(30, 50));
		
		System.out.println(o.sum(30, 20, 40, 10));
		
//		System.out.println(o.sum(30,20, 40));
	}

}
