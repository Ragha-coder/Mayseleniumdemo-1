package com.seleniumprograms.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Getdataexample {
	
	@Test(dataProvider="TC1")
	public void personalDetails( String name,String lastname,String firstname,String emailId) {
		
		
		System.out.println("my lastname  :"+lastname);
		
		System.out.println("my lastname  :"+firstname);
		
		System.out.println("my lastname  :"+name);
		
		System.out.println("my lastname  :"+emailId);
	}
	
	
	
	@DataProvider(name="TC1")
	public Object[][] getDatafromdataprovider(){
		return new Object[][]
		{
			{"Ponneri","Ramesh","Ramesh Ponneri","Ponneriramesh@gmail.com"},
			{"Ponneri","Ramesh","Ramesh Ponneri","Ponneriramesh@gmail.com"},
			{"Ponneri","Ramesh","Ramesh Ponneri","Ponneriramesh@gmail.com"},
			{"Ponneri","Ramesh","Ramesh Ponneri","Ponneriramesh@gmail.com"}
		};
	}


}
