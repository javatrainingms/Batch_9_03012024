package com.oops._20122023;

public class Company {

	Company()
	{
		this(45);
		System.out.println("this is defautl construcotre...");
		
	}
	
	Company(int i)
	{
		this("raju");
		System.out.println("this is paramerised construcotre...>>int>>>");
	}
	
	Company(String name)
	{
//		this(123);
		System.out.println("this is paramerised construcotre...>>String>>>");
	}
	
	
	int i;
	public void setI(int i)
	{
			this.i=i;
		}
}
