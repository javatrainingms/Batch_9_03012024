package com.exception._27122023;

import java.util.Scanner;

public class AgeCheckingTesting {
	public static void main(String[] args) throws AgeEligibleExcpeiton,Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age::");
		int age=sc.nextInt();
		
		if(age>35  && age <100)
		{
			System.out.println("he is eligible");
		}
		else if(age>0 && age<=35){
			System.out.println("he is not eligible");
		}
		else
		{
//			System.out.println("Boss please provide age in 0 to 100 middle value...");
			throw new AgeEligibleExcpeiton("Boss please provide age in 0 to 100 middle value...");
//			throw new Exception("Boss please provide age in 0 to 100 middle value...");
		}
		
		
		System.out.println("enter name:::");
		String name=sc.next();
		System.out.println("name value>>>"+name);
		
	}

}
