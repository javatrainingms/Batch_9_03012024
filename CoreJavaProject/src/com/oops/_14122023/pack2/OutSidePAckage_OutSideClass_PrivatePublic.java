package com.oops._14122023.pack2;

import pack1.DefaultRelatedClass;
import pack1.PrototectedRelatedClass;
import pack1.PublicRelatedClass;

public class OutSidePAckage_OutSideClass_PrivatePublic {
	
	public void method1()
	{
		PublicRelatedClass p=new PublicRelatedClass();
		System.out.println(p.name);
		
//		DefaultRelatedClass d=new DefaultRelatedClass();
//		System.out.println(d.name);
		
//		PrototectedRelatedClass p2=new PrototectedRelatedClass();
//		System.out.println(p2.name);
	}
	
	public static void method2()
	{
		PublicRelatedClass p=new PublicRelatedClass();
		System.out.println(p.name);
		
//		DefaultRelatedClass d=new DefaultRelatedClass();
//		System.out.println(d.name);
		
//		PrototectedRelatedClass p2=new PrototectedRelatedClass();
//		System.out.println(p2.name);
	}


}
