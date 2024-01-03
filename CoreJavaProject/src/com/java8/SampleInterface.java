package com.java8;

public interface SampleInterface {
	
	public  int sum(int a,int b);
	
	public static void method1()
	{
		System.out.println("this is static method in interface...");
	}
	
	public default void printArrays(int arr[])
	{
		for(int i:arr)
		{
			System.out.println("i value>>>interface>>>"+i);
		}
	}

}
