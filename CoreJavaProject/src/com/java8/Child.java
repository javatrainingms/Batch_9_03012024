package com.java8;

public class Child implements SampleInterface{

	@Override
	public int sum(int a, int b) {
		return 0;
	}
	
	
	@Override
	public void printArrays(int[] arr) {
		for(int i:arr)
		{
			System.out.println("my values>>>"+i);
		}
	}

}
