
public class HowToCallStaticVariable {
	public static void main(String[] args) {
		StaticVariableExample1 s=new StaticVariableExample1();
		System.out.println(s.name);
		
		System.out.println(StaticVariableExample1.name);
	}

}
