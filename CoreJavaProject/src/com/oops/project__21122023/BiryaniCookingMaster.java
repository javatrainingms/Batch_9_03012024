package com.oops.project__21122023;

public class BiryaniCookingMaster {
	
	public static Biryani getBiryaniPrepare(int quanity,String foodName,String foodType)
	{
			Biryani biryani =new Biryani();
			
			if(foodType.equals("chicken"))
			{
				biryani =new ChickenBiryani();
			}
			if(foodType.equals("mutton"))
			{
				biryani =new MuttonBiryani();	
			}
			biryani.setFoodname(foodName);
			biryani.setFoodtype(foodType);
			biryani.setQuanity(quanity);
			
			return biryani;
	}
}
