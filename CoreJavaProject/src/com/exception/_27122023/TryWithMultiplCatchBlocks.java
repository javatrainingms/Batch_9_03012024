package com.exception._27122023;

public class TryWithMultiplCatchBlocks {
	public static void main(String[] args) {
		try
		{
			String arr[]= {"raju","rani",null,"kiran","karthik","prem"};
			arr[0]="harish";
			arr[9]="janshi";
			System.out.println(arr[2].charAt(4)=='r');
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("this is problem for index length");
		}catch(NullPointerException e)
		{
			System.out.println("this is problem for null value...");	
		}
		
		catch(Exception e)
		{
			System.out.println("this is generic Excepiton");
		}
		
	}

}
