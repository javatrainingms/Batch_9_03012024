package com.oops._16122023;

public class EmployeeTester {
	public static void main(String[] args) {
		Employee emp=new Employee();
//		emp.id=101;
//		emp.name="Raju";
//		emp.address="hyderabad";
//		emp.salary=12000;
		
		emp.setId(101);
		emp.setName("Raju");
		emp.setAddress("hyderabad");
		emp.setSalary(12000);
		
//		System.out.println(emp.getId()+"::"+emp.getName()+"::"+emp.getAddress()+"::"+emp.getSalary());
		System.out.println(emp);

	}

}
