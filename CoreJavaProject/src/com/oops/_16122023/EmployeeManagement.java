package com.oops._16122023;

public class EmployeeManagement extends GetEmployeeService 
			implements Registration_DeleteionService,Registration_getEmployeeDetailsService{
	public void registrationEmployee()
	{
		System.out.println("this is Registration process");
	}
	public void getEmployeeDetails()
	{
		System.out.println("this is get Emplyoee process");
	}
	
	public void deleteEmployeeDetails()
	{
		System.out.println("this is deletion process");
	}
	public void updateEmploeeDetails()
	{
		System.out.println("this is updataion process");
	}

}
