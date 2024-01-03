package com.oops.project__21122023;

import java.util.Scanner;

public class Person_withMulitpleORders {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many persons?");
		int n=sc.nextInt();
		
		BiryaniRequest arr[]=new BiryaniRequest[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println((i+1)+">>person");
			System.out.println("enter food name");
			String foodName=sc.next();
			System.out.println("enter food type");
			String foodType=sc.next();
			System.out.println("enter Quantity");
			int quantity=sc.nextInt();
			arr[i]=new BiryaniRequest(foodName,foodType,quantity);
			
		}

		Biryani [] mybiryanis=BiryaniHotel.getBiryaniFromHotelUsingArray(arr);
		
		for(Biryani b:mybiryanis)
		{
			System.out.println(b);
		}
	}

}
