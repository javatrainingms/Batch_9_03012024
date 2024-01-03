
public class LocalVariableExample2 {
	
	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		int sum=a+b;
//		System.out.println("sum value>>>"+sum);
//		
//		int a1=100;
//		int b1=200;
//		int sum1=a1+b1;
//		System.out.println("sum value>>>"+sum1);
		
		LocalVariableExample2 l=new LocalVariableExample2();
		System.out.println(l.sumcal(10, 20));
		System.out.println(l.sumcal(100, 200));
		System.out.println(l.sumcal(400, 500));
		
	}
	
	
	int sumcal(int a,int b)
	{
		int sum=a+b;
		return sum;
	}

}
