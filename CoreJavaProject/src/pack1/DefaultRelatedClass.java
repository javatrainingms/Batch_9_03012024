package pack1;

public class DefaultRelatedClass {
	String name="phani";
	
	public void method1()
	{
		DefaultRelatedClass d=new DefaultRelatedClass();
		System.out.println(d.name);
	}

	public static void method2()
	{
		DefaultRelatedClass d=new DefaultRelatedClass();
		System.out.println(d.name);
	}
}
