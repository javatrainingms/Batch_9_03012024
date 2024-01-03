package com.exception._26122023;

public class ExceptionExample1 {

	public static void main(String[] args) {
		System.out.println("state 1");
		System.out.println("state 2");
		System.out.println("state 3");
		System.out.println("state 4");
		try
		{
			System.out.println("state 5"+10/0);   //unexcpeted event...
		}
		catch(ArithmeticException e)
		{
			System.out.println("some issue with arithmetic exception in 5 th statement...");
		}
		
		
		System.out.println("state 6");
		System.out.println("state 7");
		System.out.println("state 8");
		System.out.println("state 9");
		
	}
}
