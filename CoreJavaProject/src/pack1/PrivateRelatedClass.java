package pack1;

public class PrivateRelatedClass {

	private String name="phani";
	
	public void wihtinMethod1()
	{
		PrivateRelatedClass p=new PrivateRelatedClass();
		System.out.println(p.name);
	}
	
	public static void wihtinMethod2()
	{
		PrivateRelatedClass p=new PrivateRelatedClass();
		System.out.println(p.name);
	}
}
