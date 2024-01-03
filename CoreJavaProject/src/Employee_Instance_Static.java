
public class Employee_Instance_Static {
	public static void main(String[] args) {
		Employee.companyName="Wipro";
		Employee emp=new Employee();
		emp.id=101;
		emp.name="raju";
		emp.address="hyd";
		emp.salary=12000;
//		emp.companyName="TCS";
		System.out.println(emp.id+"::"+emp.name+"::"+emp.address+"::"+emp.salary+"::"+emp.companyName);

	
		Employee emp1=new Employee();
		emp1.id=123;
		emp1.name="kiran";
		emp1.address="hyd";
		emp1.salary=16000;
//		emp1.companyName="TCS";
		System.out.println(emp1.id+"::"+emp1.name+"::"+emp1.address+"::"+emp1.salary+"::"+emp1.companyName);
		
		Employee emp2=new Employee();
		emp2.id=234;
//		emp2.name="karthik";
		emp2.address="hyd";
		emp2.salary=13000;
//		emp2.companyName="TCS";
		System.out.println(emp2.id+"::"+emp2.name+"::"+emp2.address+"::"+emp2.salary+"::"+emp2.companyName);

	}

}
