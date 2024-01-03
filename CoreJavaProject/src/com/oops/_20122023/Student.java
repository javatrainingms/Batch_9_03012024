package com.oops._20122023;

public class Student {
	
	private String name;
	private int id;

	public Student(){
	System.out.println("this is default constructor...");	
	}
	
	Student(String name)
	{
		this.name=name;
		System.out.println("this is parameterised constructor...>>String");
	}

	
	Student(int id,String name)
	{
		this.name=name;
		this.id=id;
		System.out.println("this is parameterised constructor...>>>int and String");
	}
	

	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}
	
}
