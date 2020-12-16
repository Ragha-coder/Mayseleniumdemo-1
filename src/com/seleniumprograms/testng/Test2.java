package com.seleniumprograms.testng;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	@Test
	public void test2(){
		System.out.println("Test 2");
		Assert.assertTrue(false);
		
	}
	
	
	@Test
	public void softAssert(){
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
	}
}
