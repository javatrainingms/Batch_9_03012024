package com._08122023;

import java.util.Scanner;

public class ShiftOperatorExample2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("show your id proof");
		String idproof=sc.next();
		
		if(idproof.equals("adhaar") || idproof.equals("pancard")) {
			System.out.println("he is eligible for interviw");
		}
		else
		{
			System.out.println("he is not elignble for interview");
		}
			
	}

}
