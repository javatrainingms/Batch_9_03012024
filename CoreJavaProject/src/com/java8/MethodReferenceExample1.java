package com.java8;

public class MethodReferenceExample1 {
	
	public static void main(String[] args) {
//		FunctionalInterfaceExampel1 f=(a,b)->a+b;
		
		FunctionalInterfaceExampel1 f=MethodReferenceExample1::summation;
		System.out.println(f.sum(30, 40));
	}
	
	
	public static int summation(int a,int b)
	{
		int sum=a+b;
		return sum;
	}

}
