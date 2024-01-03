package com._09122023;

public class BreakExample {
	public static void main(String[] args) {
		for(int i=0;true;i++)
		{
			if(i==100)
			{
				System.out.println("house full");
				break;
//				return;
			}
			System.out.println("i>>>"+i);
		}
	}

}
