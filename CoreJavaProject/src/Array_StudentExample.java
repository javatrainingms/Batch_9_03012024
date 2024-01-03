import java.util.Iterator;

public class Array_StudentExample {
	public static void main(String[] args) {
		Student std[]=new Student[6];
		std[0]=new Student();
		std[0].id=101;
		std[0].name="raju";
		std[0].address="hyderabad";
		
		std[1]=new Student();
		std[1].id=134;
		std[1].name="kiran";
		std[1].address="hyderabad";
		
		std[2]=new Student();
		std[2].id=171;
		std[2].name="Tanya";
		std[2].address="hyderabad";
	
		std[3]=new Student();
		std[3].id=171;
		std[3].name="Tanya";
		std[3].address="hyderabad";
		std[4]=new Student();
		std[4].id=171;
		std[4].name="Tanya";
		std[4].address="hyderabad";
		std[5]=new Student();
		std[5].id=171;
		std[5].name="Tanya";
		std[5].address="hyderabad";
	
	
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].id+"\t"+std[i].name+"\t"+std[i].address);
		}
	}

}
