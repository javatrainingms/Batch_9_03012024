package com.java8;

public class FunctionalInterfaceTesting {
	public static void main(String[] args) {
		//java7
		FunctionalInterfaceExampel1 f= new Child2();
		System.out.println(f.sum(30, 20));
//		f.method2();
		
		//jav8
		FunctionalInterfaceExampel1 f1=(a,b)  -> a+b;
		System.out.println(f1.sum(30, 50));
	}

}
