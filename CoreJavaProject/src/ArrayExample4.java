
public class ArrayExample4 {
	public static void main(String[] args) {
		int arr[][]=new int [6][3];
		
		System.out.println(arr);
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(i+""+j+"\t");
			}
			System.out.println();
		}
		
	}

}

/*
 out for ==>i=0  i<6
 	inner j=0
 			j<3
 					00 space 
 	
		j=j+1
		j=1
			j<3
				01 space
		j=1+1=2
			j<3
				02 space
		

i=i+1==>i=1
	inner j=0
 			j<3
 					10 space 
 	
		j=j+1
		j=1
			j<3
				11 space
		j=1+1=2
			j<3
				12 space 		
 
 */
