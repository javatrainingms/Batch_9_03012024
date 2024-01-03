package pack1;

public class PrototectedRelatedClass {
	protected String name="phani";
	
	public void method1()
	{
		PrototectedRelatedClass p=new PrototectedRelatedClass();
		System.out.println(p.name);
	}
	
	public static void method2()
	{
		PrototectedRelatedClass p=new PrototectedRelatedClass();
		System.out.println(p.name);	
	}

}
