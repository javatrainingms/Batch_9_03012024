package com.java8;

public interface SampleInterface1 {
	
	public default void printArrays(int arr[])
	{
		for(int i:arr)
		{
			System.out.println("i value>>>interface1>>>"+i);
		}
	}


}
