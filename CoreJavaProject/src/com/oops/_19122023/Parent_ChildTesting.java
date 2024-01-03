package com.oops._19122023;

public class Parent_ChildTesting {
	public static void main(String[] args) {
		
		//Scenario 1: parent reference and PArent Object
		Parent p=new Parent();
		p.method1();   //parent method
		p.method2();  //parent method
//		p.method3();  //child methods can't be access in parent class
		System.out.println("==========================================");

		//Scenario 2: Child reference and Child Object
		Child c=new Child();
		c.method1();  //Child method
		c.method2();  //Parent method
		c.method3();  //Child method
		System.out.println("=====================");
		
		//Scenario 3: parent reference and Child Object
		Parent p1=new Child();   //implicit type casting
		p1.method1();   //Child Method   //runtime polymorpism
		p1.method2();  //parent method
//		p1.method3();  //method3 is not avaible in PArent class(parent ref)

		//Scenario 3: Child reference and PArent Object
//		Child c1=(Child)new Parent();  //explicit type casting
//		c1.method1();
//		c1.method2();
//		c1.method3();
		
	}

}
