package com.oops._20122023;

public class InstanceBlockFlow {
	
	int i=10;
	{
		System.out.println("first instance block");
		System.out.println("first instance block>>i>>"+i);
//		System.out.println("first instance block>>j>>"+j);
//		System.out.println("first instance block>>k>>"+k);
		}

	
	int j=30;
	InstanceBlockFlow()
	{
		System.out.println("default construcor..");
		System.out.println("default construcor..>>i>>"+i);
		System.out.println("default construcor..>>j>>"+j);
		System.out.println("default construcor..>>k>>"+k);
	}
	

	{
		System.out.println("second instance block");
		System.out.println("second instance block>>>i>>"+i);
		System.out.println("second instance block>>>j>>"+j);
//		System.out.println("second instance block>>>k>>"+k);
	}
	
	
	int k=40;
}
