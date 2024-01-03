package com._08122023;

import java.util.Scanner;

public class SwitchLoopExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 : addition");
		System.out.println("press 2 : subtraction");
		System.out.println("press 3 : multiplication");
		System.out.println("press 4 : division");
		System.out.println("press 5 : remainder");
		
		System.out.println("enter first number");
		int n1=sc.nextInt();
		
		System.out.println("enter Second number");
		int n2=sc.nextInt();
		
		System.out.println("enter your choice...");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
					System.out.println("addition processed started");
					int add=n1+n2;
					System.out.println("addition >>>"+add);
					break;
			
			
			case 2:
					System.out.println("subtraction processed started");
					int sub=n1-n2; 
					System.out.println("subtraction::"+sub);
					break;
			case 3:
					System.out.println("multiplication processed started");
					int mul=n1*n2;
					System.out.println("multiplication:::"+mul);
					break;
			case 4:
					System.out.println("division processed started");
					int div=n1/n2;
					System.out.println("division:::"+div);
					break;
			case 5:
					System.out.println("remainder processed started");
					int remainder=n1%n2;
					System.out.println("remainder:::"+remainder);
					break;
			default:
					System.out.println("boss please provide 1 to 5 only...");
		}
		
		
//		int add=n1+n2;
//		int sub=n1-n2;
//		int mul=n1*n2;
//		int div=n1/n2;
//		int remainder=n1%n2;
//		
//		System.out.println("addition:::"+add);
//		System.out.println("subtraction::"+sub);
//		System.out.println("multiplication:::"+mul);
//		System.out.println("division:::"+div);
//		System.out.println("remainder:::"+remainder);
		
	}

}
