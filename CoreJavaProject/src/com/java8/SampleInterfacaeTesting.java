package com.java8;

public class SampleInterfacaeTesting {

	public static void main(String[] args) {
		SampleInterface.method1();
		
		Child c=new Child();
		c.printArrays(new int[] {5,3,6,8});
	}
}
