package pack2;

import pack1.Parent;

public class Child extends Parent{  //Child is a PArent
	
	public void method1() {
//		Parent p=new Parent();
//		System.out.println(p.name);
		
		Child c=new Child();
		System.out.println(c.name);
				
	}
	
	public static void method2() {
		Child c=new Child();
		System.out.println(c.name);
	
	}

}
