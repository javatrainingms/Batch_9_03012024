package com.exception._27122023;

public class TryCatchWithExcpetionMethods {
	
	public static void main(String[] args)  
	{
		System.out.println("this is main method");
		TryCatchWithExcpetionMethods t=new TryCatchWithExcpetionMethods();
		t.method1();
	}
	
	public void method1() 
	{
		System.out.println("this is method1");
		method2();
	}
	
	public void method2() 
	{
		System.out.println("this is method2");
		method3();
	}
	
	
	public void method3()
	{
		System.out.println("this is method3");
		try
		{
			System.out.println("this some business logic>> "+10/0);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
//			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}


}
