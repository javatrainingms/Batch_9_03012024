package com.exception._26122023;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionExample2 {
	
	
	public static void main(String[] args) throws IOException {
		String s1="step 1. item selected ";
		String s2="step 2. added into cart ";
		String s3="step 3. go to payment ";
		String s4="step 4. pay the money";
		String s5="step 5. order was dispatched";
		String s6="step 6.deliveried to home ";
		

		File f=new File("amazon.txt");
		FileWriter fw=new FileWriter(f);
		
		fw.write(s1);
		fw.write("\n");
		fw.write(s2);
		fw.write("\n");
		fw.write(s3);
		fw.write("\n");
		fw.write(s4);
		fw.write("\n");
		fw.write(s5+10/0);
		fw.write("\n");
		fw.write(s6);
		
		fw.close();
//		fw.flush();
	}

}
