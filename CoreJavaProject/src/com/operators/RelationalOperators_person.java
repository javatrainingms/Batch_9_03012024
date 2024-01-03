package com.operators;

import java.util.Scanner;

public class RelationalOperators_person {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		
		Person p=new Person();
		p.id=id;
		p.name=name;
		p.age=age;
		
		
		if(p.age>=60)
		{
			System.out.println("he is eligible");
		}
		else
		{
			System.out.println("he is not eligibel...");
		}
	}
}
