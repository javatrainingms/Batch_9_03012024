package com.exception._27122023;

public class HandlingTheRunTImeExceptionUsingIFloop {
	
	public static void main(String[] args) {
		String arr[]= {"raju","rani",null,"kiran","karthik","prem"};
		
		arr[0]="harish";

		if(arr.length>9)
		{
			arr[9]="janshi";
		}
	
		if(arr[2] !=null)
		{
		System.out.println(arr[2].charAt(4)=='r');
		}
		
	}

}
