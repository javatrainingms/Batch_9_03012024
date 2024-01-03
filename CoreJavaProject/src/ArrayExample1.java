
public class ArrayExample1 {
	public static void main(String[] args) {
		int arr1[]= {4,7,2,7,9,4,7,9,4,467,47,57,7,45,12,32,67};
		
//		System.out.println(arr1[0]%2  ==  0);
//		System.out.println(arr1[1]%2  ==  0);
//		
		
		for(int i=0;	i<arr1.length;   	i=i+1)
		{
			if(arr1[i]%2  ==  0)
			{
				//even
				System.out.println(arr1[i]);
			}
		}
	}

}

/*
int i=0;
	arr[i]==>arr[0] ==>4%2 ==>0
			true
				console ==>print 4 
				
				i=i+1 ==>i=0+1==>i=1

i=1
	arr[1]==>7 
		7%2 ==>false 
			i=i+1 ==>i=1+!==>i=2 
				


*/