package com.oops.project__21122023;

import java.util.Random;

public class TiffinHotel {
	
	public static Tiffin getTiffinFromHotel(int quantity,String foodname,String foodType)
	{
		Tiffin t=TiffinCookingMaster.getTiffin(quantity, foodname, foodType);

		Random r=new Random();//token number...
		t.setId(r.nextInt(1000));
		
		t.setPrice(getPriceForTiffin(quantity, foodname));

		
		return t;
	}
	
	private static double getPriceForTiffin(int quanity,String foodname)
	{
		double price=0;
		if(foodname.equals("dosa"))
		{
			price=quanity*TiffinHotelMenu.dosa;
		}
		if(foodname.equals("idly"))
		{
			price=quanity*TiffinHotelMenu.idly;
		}
		return price;
	}
	


}
