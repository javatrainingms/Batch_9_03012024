package com.oops.project__21122023;

public class BiryaniRequest {
	
	private String foodname;
	private String foodtype;
	private int quanity;
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public BiryaniRequest(String foodname, String foodtype, int quanity) {
		super();
		this.foodname = foodname;
		this.foodtype = foodtype;
		this.quanity = quanity;
	}
	public BiryaniRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BiryaniRequest [foodname=" + foodname + ", foodtype=" + foodtype + ", quanity=" + quanity + "]";
	}
	
	

}
