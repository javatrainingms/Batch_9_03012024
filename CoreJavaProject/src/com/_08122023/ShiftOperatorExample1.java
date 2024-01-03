package com._08122023;

import java.util.Scanner;

public class ShiftOperatorExample1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your education");
		String education=sc.next();
		System.out.println("enter your exp::");
		int exp=sc.nextInt();

		if((education.equals("btech"))  && (exp >4))
		{
			System.out.println("he is eligible");

		}
		else
		{
			System.out.println("he is not eligible..");
		}

		//		if(education.equals("btech"))
		//		{
		//			if(exp >4)
		//			{
		//				System.out.println("he is eligible");
		//			}
		//			else
		//			{
		//				System.out.println("he is not eligible");
		//			}
		//		}
		//		else
		//		{
		//			System.out.println("he is not eligible..");
		//		}

	}

}
