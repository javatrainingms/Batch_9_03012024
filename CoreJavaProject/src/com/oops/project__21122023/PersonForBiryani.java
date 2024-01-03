package com.oops.project__21122023;

import java.util.Scanner;

public class PersonForBiryani {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter food name");
		String foodName=sc.next();
		System.out.println("enter food type");
		String foodType=sc.next();
		System.out.println("enter Quantity");
		int quantity=sc.nextInt();
		
		Biryani biryani=BiryaniHotel.getBiryaniFromHotel(quantity, foodName, foodType);
		
		System.out.println(biryani);
				
		
	}
}
