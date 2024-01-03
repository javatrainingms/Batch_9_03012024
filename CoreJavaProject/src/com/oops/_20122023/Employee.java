package com.oops._20122023;

public class Employee {
	
	private int id=101;
	private String name="raju";
	private Address address=new Address();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
//	public void display()
//	{
//		System.out.println(id+":::"+name+"::"+address.city+":::"+address.state+":::"+address.pincode);
//	}

	
	
}
