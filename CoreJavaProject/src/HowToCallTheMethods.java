
public class HowToCallTheMethods {
	
	public static void main(String[] args) {
		//step1 
		MethodsExample m=		new MethodsExample();
		m.method1();
		m.method2();
		
		//step2 
//		MethodsExample.method1();   //compile time error
		MethodsExample.method2();
	}

}
