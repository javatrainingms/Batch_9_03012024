package com.exception._27122023;

public class ThrowsKeywordExample {
	public static void main(String[] args) throws Exception {
		System.out.println("this is main method");
		ThrowsKeywordExample t=new ThrowsKeywordExample();
		t.method1();
	}
	
	public void method1() throws Exception
	{
		System.out.println("this is method1");
		method2();
	}
	
	public void method2() throws Exception
	{
		System.out.println("this is method2");
		method3();
	}
	
	
	public void method3()throws Exception
	{
		System.out.println("this is method3");
		System.out.println("this some business logic>> "+10/0);	//	
	}

}
