package com.oops.project__21122023;

public class ForumMall {

	public static Food getFood(String categiry,int quantity,String foodname,String foodType) 
	{
		Food f=new Food();
		if(categiry.equals("tiffin"))
		{
			f=TiffinHotel.getTiffinFromHotel(quantity, foodname, foodType);
		}
		if(categiry.equals("biryani"))
		{
			f=BiryaniHotel.getBiryaniFromHotel(quantity, foodname, foodType);
		}
		return f;
	}
}
