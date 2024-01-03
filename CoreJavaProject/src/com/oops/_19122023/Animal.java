package com.oops._19122023;

public class Animal {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void eating()
	{
		System.out.println(name+"::::was eating food");
	}
	
	public void sleeping()
	{
		System.out.println(name+"::::was sleeping");
	}
	
	public void drinking()
	{
		System.out.println(name+"::::was drinking water");
	}


}
