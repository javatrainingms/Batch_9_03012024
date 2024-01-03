package com.exception._28122023;

public class FinaliseExample {
	public static void main(String[] args) throws Throwable {
		FinaliseExample f=new FinaliseExample();
//		f.finalize();
//		f.finalize();
//		f.finalize();
		
		f=null;
		
		FinaliseExample f1=new FinaliseExample();
		FinaliseExample f2=new FinaliseExample();
		
		f2=f1;
		
		
		
		System.gc();
//		System.gc();
//		System.gc();
//		System.gc();
//		System.gc();
		
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is finalise method...");
	}

}
