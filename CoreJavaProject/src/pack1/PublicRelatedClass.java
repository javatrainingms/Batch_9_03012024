package pack1;

public class PublicRelatedClass {
	
	public String name="phani";
	
	public void withinMethod1()
	{
		PublicRelatedClass p=new PublicRelatedClass();
		System.out.println(p.name);
	}

	public static void withinMethod2()
	{
		PublicRelatedClass p=new PublicRelatedClass();
		System.out.println(p.name);
	}

}
