package com.oops.project__21122023;

public class TiffinCookingMaster {
	
	public static Tiffin getTiffin(int quantity,String foodname,String foodType)
	{
		Tiffin t=new Tiffin();
		if(foodname.equals("dosa"))
		{
			t=new Dosa();
		}
		
		if(foodname.equals("idly"))
		{
			t=new Idly();
		}
		t.setFoodname(foodname);
		t.setFoodtype(foodType);
		t.setQuanity(quantity);
		return t;
	}



}
