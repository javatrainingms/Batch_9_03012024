import java.util.Iterator;

public class ArrayExample5 {
	public static void main(String[] args) {
		String studentdata[][]=new String[6][3];
		studentdata[0][0]="101";
		studentdata[0][1]="Raju";
		studentdata[0][2]="hyderabad";

		
		studentdata[1][0]="145";
		studentdata[1][1]="harish";
		studentdata[1][2]="hyderabad";

		studentdata[2][0]="167";
		studentdata[2][1]="karthik";
		studentdata[2][2]="hyderabad";

		studentdata[3][0]="172";
		studentdata[3][1]="Kiran";
		studentdata[3][2]="hyderabad";


		studentdata[4][0]="782";
		studentdata[4][1]="Kiran1";
		studentdata[4][2]="hyderabad";

		studentdata[5][0]="563";
		studentdata[5][1]="Kiran6";
		studentdata[5][2]="hyderabad";

		for (int i = 0; i < studentdata.length; i++) {
			for (int j = 0; j < studentdata[i].length; j++) {
				System.out.print(studentdata[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
