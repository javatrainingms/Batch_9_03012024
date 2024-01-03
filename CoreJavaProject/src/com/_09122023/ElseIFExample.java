package com._09122023;

import java.util.Scanner;

public class ElseIFExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		if(marks >80 && marks <=100)
		{
			System.out.println("A grade");
		}
		else if(marks>60   && marks <=80)
		{
			System.out.println("B grade");
		}
		else if (marks >45 && marks <=60)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("D grades");
		}
	}

}
