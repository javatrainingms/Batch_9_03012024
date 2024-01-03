package com.exception._26122023;

import java.io.File;

public class FileExample1 {
	
	public static void main(String[] args) {
		File f=new File("C:\\Users\\ammuarjun\\Desktop\\java\\client1\\abc.txt");
		System.out.println("file is avaible or not >>>>"+f.exists());
		System.out.println("getAbsolutePath>>>>"+f.getAbsolutePath());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());
		
	}

}
