package com.oops._20122023;

public class EmployeeTester {

	public static void main(String[] args) {
		Address address=new Address();
		address.setCity("hyderabad");
//		address.setState("TS");
		address.setPincode(500018);
		
		Employee emp=new Employee();
		emp.setAddress(address);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getCity());
//		System.out.println(emp.getAddress().getState());
		System.out.println(emp.getAddress().getPincode());
		
		System.out.println("===============");
		//100 lines 
		emp.setId(2000);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getCity());
//		System.out.println(emp.getAddress().getState());
		System.out.println(emp.getAddress().getPincode());
		
	}
	
//	public static void main(String[] args) {
//		Address address=new Address();
//		address.city="hyderabad";
//		address.state="TS";
//		address.pincode=500018;
//		
//		Employee emp=new Employee();
////		emp.id=101;
////		emp.name="raju";
//		emp.address=address;
//		
//		emp.display();
//	
//		Address address1=new Address();
//		address1.city="Vizag";
//		address1.state="AP";
//		address1.pincode=534518;
//		
////		Employee emp1=new Employee();
//		emp.id=123;
//		emp.name="kiran";
//		emp.address=address1;
//		
//		emp.display();
//		
//	}

}
