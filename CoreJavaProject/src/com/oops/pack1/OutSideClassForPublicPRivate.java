package com.oops.pack1;

public class OutSideClassForPublicPRivate {
	
	public void method1()
	{
		PublicRelatedClass p=new PublicRelatedClass();
		System.out.println(p.name);
		
		PrivateRelatedClass p1=new PrivateRelatedClass();
//		System.out.println(p1.name); //Compiletime error
		
		DefaultRelatedClass d=new DefaultRelatedClass();
		System.out.println(d.name);
		
		PrototectedRelatedClass p2=new PrototectedRelatedClass();
		System.out.println(p2.name);
		
	}
	
	public static void method2()
	{
		PublicRelatedClass p=new PublicRelatedClass();
		System.out.println(p.name);

		PrivateRelatedClass p1=new PrivateRelatedClass();
//		System.out.println(p1.name); //Compiletime error
		
		DefaultRelatedClass d=new DefaultRelatedClass();
		System.out.println(d.name);
		
		PrototectedRelatedClass p2=new PrototectedRelatedClass();
		System.out.println(p2.name);
	}

}
