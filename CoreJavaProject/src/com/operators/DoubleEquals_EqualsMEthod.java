package com.operators;

public class DoubleEquals_EqualsMEthod {
	public static void main(String[] args) {
		String s="data";
		String s1="data";
		String s2=new String("data");
		
		System.out.println("(s==s1)>>>>>"+(s==s1)); //true
		System.out.println("(s==s2)>>>>>"+(s==s2)); //false
		
		System.out.println("(s.equals(s2))>>>>"+(s.equals(s2)));//true
		System.out.println("(s.equals(s1))>>>>"+(s.equals(s1)));//true
	}

}
