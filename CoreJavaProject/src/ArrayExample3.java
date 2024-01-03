
public class ArrayExample3 {

	public static void main(String[] args) {
		int arr[]= {5,31,56};
	
		System.out.println(sumCalc(arr));
		
		int arr1[]= {4,5,6,1};
		System.out.println(sumCalc(arr1));
		
		int arr2[]= {5,3,56,78,2,6,3,7,3,7,3,12,4567};
		System.out.println(sumCalc(arr2));
		
		System.out.println(sumCalc(new int[] {4,1,8,3})); //annonymous function /no name for arrays
		
		//100 code
		
		System.out.println(arr[2]);
		
		System.out.println();
	}
	
	
	static int sumCalc(int arr[])
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum =sum+arr[i];
		}
		
		return sum;
	}
	
	
}
