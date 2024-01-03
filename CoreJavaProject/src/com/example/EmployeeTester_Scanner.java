package com.example;

import java.util.Scanner;

public class EmployeeTester_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:::");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter Address");
		String address=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		System.out.println("enter gender");
		char gender=sc.next().charAt(0);
		
		
		Employee emp=new Employee();
		emp.id=id;
		emp.name=name;
		emp.address=address;
		emp.salary=salary;
		emp.gender=gender;
		
		System.out.println(emp.id+"::::"+emp.name+":::"+emp.salary+"::"+emp.gender+"::"+emp.address);
	}
}
