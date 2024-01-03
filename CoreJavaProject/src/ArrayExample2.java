
public class ArrayExample2 {
	public static void main(String[] args) {
		int arr[]= {5,3,1,6,2,5,7,3,7,3,678,357,346};
//		int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//		System.out.println(sum);
		
		int sum=0;
		for (int i = 0;    i < arr.length;   i++) {
			sum=arr[i]+sum;
//			sum +=arr[i];
		}
		
		System.out.println("sum value>>>"+sum);
	}

}
