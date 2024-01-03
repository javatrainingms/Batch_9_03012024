package com.oops._20122023;

public class Child extends Parent{

	Child()
	{
		System.out.println("child==>default constructor...");
	}
	
	Child(String name)
	{
		super("somedata");
		System.out.println("Child>>>String>>PArametrised construcotr...");
		
	}
	
	public void method1()
	{
		System.out.println("child>>>method1");
	}
	
	
	public void method2()
	{
		super.method1();
	}
	
	public void method3()
	{
		System.out.println("i value>>"+super.i);
	}
	int i=20;
}
