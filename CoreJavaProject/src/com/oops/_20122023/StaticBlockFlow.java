package com.oops._20122023;

public class StaticBlockFlow {

	static int i=10;
	static{
		System.out.println("first static block ");
		System.out.println("first static block>>>i>>>"+i);
//		System.out.println("first static block>>>j>>>"+j);
	}

	StaticBlockFlow()
	{
		System.out.println("defautl constructror....");
	}

	static int j=20;
	static{
		System.out.println("Second static block ");
		System.out.println("Second static block>>>i>>>"+i);
		System.out.println("Second static block>>>j>>>"+j);
	}
}
