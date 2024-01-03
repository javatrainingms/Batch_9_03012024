package com.oops.project__21122023;

public class Food {
	


	private int id;
	private String foodname;
	private String foodtype;
	private int quanity;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Food(int id, String foodname, String foodtype, int quanity, double price) {
		super();
		this.id = id;
		this.foodname = foodname;
		this.foodtype = foodtype;
		this.quanity = quanity;
		this.price = price;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", foodname=" + foodname + ", foodtype=" + foodtype + ", quanity=" + quanity
				+ ", price=" + price + "]";
	}


	


}
