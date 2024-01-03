package com.oops._20122023;

public class StudentTester {
	
	public static void main(String[] args) {
//		new Student();
//		new Student();
//		new Student();
		new Student();
		
		Student std=new Student("raju");
		System.out.println(std.getName());
		std=new Student(101,"kiran");
		System.out.println(std.getName());
		System.out.println(std.getId());
	}

}
