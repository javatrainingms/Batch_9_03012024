package com.operators;

import java.util.Scanner;

public class EqualityOperatorsExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter education:::");
		String education=sc.next();
		
		Employee emp=new Employee();
		emp.id=id;
		emp.name=name;
		emp.education=education;
		
//		if(emp.education == "btech")
//		{
//			System.out.println("he is educated for btech");
//		}
//		else
//		{
//			System.out.println("he is not done btech");
//		}
		
		if(emp.education.equals("btech"))
		{
			System.out.println("he is educated for btech");
		}
		else
		{
			System.out.println("he is not done btech");
		}
	}
}
