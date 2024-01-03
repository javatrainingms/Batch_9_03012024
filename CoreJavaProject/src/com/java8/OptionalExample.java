package com.java8;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) {
		String arr[]=new String[5];
		
		arr[3]="raju";
		Optional o=Optional.ofNullable(arr[3]);
		if(o.isPresent())
		{
			System.out.println(arr[3].charAt(2));
		}
		else
		{
			System.out.println("boss value not avaible...");
		}
	}

}
