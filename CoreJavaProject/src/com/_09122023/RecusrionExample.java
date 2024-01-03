package com._09122023;

public class RecusrionExample {
	static int start=0;
	static int end=10;

	public static void main(String[] args) {

		recMethod();  
	}


	public static void recMethod()
	{
		if(start <= end)
		{
			System.out.println(start);
			start++;
			recMethod();
		}
	}
}
