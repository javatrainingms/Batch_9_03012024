package com.java8;

public class Child1 implements SampleInterface,SampleInterface1{

	@Override
	public int sum(int a, int b) {
		return 0;
	}

	@Override
	public void printArrays(int[] arr) {
		SampleInterface.super.printArrays(arr);
	}

}
