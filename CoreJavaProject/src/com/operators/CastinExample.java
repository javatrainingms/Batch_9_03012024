package com.operators;

public class CastinExample {
	
	public static void main(String[] args) {
		byte b=100;
		int i=b;  //byte converting into int 
		
		System.out.println("int i value>>"+i);
		
		
		int i1=100;
		byte b1=(byte)i1;
		System.out.println("byte b1 value>>>"+b1);
		
		int i2=2000;
		byte b2=(byte)i2;
		System.out.println("byte b2>>>>"+b2);
	}

}
