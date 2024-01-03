package com.oops.project__21122023;

import java.util.Random;

public class BiryaniHotel {
	
	public static Biryani[] getBiryaniFromHotelUsingArray(BiryaniRequest [] biryaniReqList)
	{
		Biryani[] biryanies=new Biryani[biryaniReqList.length];
		
		for (int i=0;i<biryaniReqList.length;i++) {
			BiryaniRequest req=biryaniReqList[i];
			Biryani biryani=BiryaniCookingMaster.getBiryaniPrepare(req.getQuanity(),req.getFoodname(),req.getFoodtype());
			
			Random r=new Random();//token number...
			biryani.setId(r.nextInt(1000));
			biryani.setPrice(getPriceForBiryani(biryani.getQuanity(),biryani.getFoodtype()));
			
			biryanies[i]=biryani;
			
		}
	return biryanies;	
	}
		
		



		

	
	public static Biryani getBiryaniFromHotel(int quantity,String foodname,String foodType)
	{
		Biryani biryani=BiryaniCookingMaster.getBiryaniPrepare(quantity, foodname, foodType);

		Random r=new Random();//token number...
		biryani.setId(r.nextInt(1000));

		biryani.setPrice(getPriceForBiryani(biryani.getQuanity(),biryani.getFoodtype()));
		
		//price
		return biryani;
	}
	
	
	private static double getPriceForBiryani(int quanity,String foodType)
	{
		double price=0;
		if(foodType.equals("chicken"))
		{
			price=quanity*BiryaniHotelMenu.chickenBiryani;
		}
		if(foodType.equals("mutton"))
		{
			price=quanity*BiryaniHotelMenu.muttonBiryani;
		}
		return price;
	}
	
	




//	public static Biryani getBiryaniFromHotel(int quantity,String foodname,String foodType)
//	{
//		Biryani biryani=BiryaniCookingMaster.getBiryaniPrepare(quantity, foodname, foodType);
//
//		Random r=new Random();//token number...
//		biryani.setId(r.nextInt(1000));
//
//		if(biryani.getFoodtype().equals("chicken"))
//		{
//			biryani.setPrice(BiryaniHotelMenu.chickenBiryani);
//		}
//		if(biryani.getFoodtype().equals("mutton"))
//		{
//			biryani.setPrice(BiryaniHotelMenu.muttonBiryani);
//		}
//		//price
//		return biryani;
//	}
}
