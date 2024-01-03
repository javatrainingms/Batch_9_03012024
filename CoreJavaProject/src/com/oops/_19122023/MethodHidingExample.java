package com.oops._19122023;

public class MethodHidingExample {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.method1();
		p.method2();
//		p.method3();//child methods can't be call in parent class level
		System.out.println("====================");
		Child1 c=new Child1();
		c.method1();  //child method
		c.method2();  //parent method 
		c.method3();  //child method
		System.out.println("=============");
		Parent1 p1=new Child1();
		p1.method1();  //PArent method 
		p1.method2();  //parent method
	}
}
