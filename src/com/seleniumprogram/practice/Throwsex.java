package com.seleniumprogram.practice;

public class Throwsex extends Throwable {
	
	static void m1() throws Throwable {
		
		final int a=10;
		int b=23;
		
		try {
			int c=b/a;
			System.out.println(c);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			throw new Exception(" i am the error");
		}finally {
			System.out.println();
		}
		
	}
	
	
	
	 protected void finalize()   
	    {   
	        System.out.println("finalize method called");   
	    }   
	public static void main(String[] args) throws Throwable {
		m1();
	}

}
