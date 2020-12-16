package com.seleniumprograms.testng;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class GetData {

	@DataProvider(name = "TC1")
	public Object[][] TC1() {
		return new Object[][] { { "Ponneri", "Ramesh", "Ramesh Ponneri", "Ponneriramesh@gmail.com" },

		};
	}

	@DataProvider(name = "TC2")
	public Object[][] TC2() {
		return new Object[][] { { "Ponneri", "Narasimha", "Narasimha Ponneri", "Narasimhah@gmail.com" },

		};
	}

	@DataProvider(name = "TC3")
	public Object[][] TC3() {
		return new Object[][] { { "Sow", "Bhagya", "Sow Bhagya", "Sowbhagya@gmail.com" }, };
	}
	
	
	
	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataprovider(ITestContext c){
	Object[][] groupArray = null;
		for (String group : c.getIncludedGroups()) {
		if(group.equalsIgnoreCase("A")){
			groupArray = new Object[][] { 
					{ "Guru99", "India" }, 
					{ "Krishna", "UK" }, 
					{ "Bhupesh", "USA" } 
				};
		break;	
		}
			else if(group.equalsIgnoreCase("B"))
			{
			groupArray = new Object[][] { 
						{  "Canada" }, 
						{  "Russia" }, 
						{  "Japan" } 
					};
			}
		break;
	}
	return groupArray;		
	}
	
	
	
	
	  @DataProvider(name="SearchProvider")
	    public Object[][] getDataFromDataprovider(Method m){
	        if(m.getName().equalsIgnoreCase("testMethodA")){
	        return new Object[][] {
	                { "Guru99", "India" },
	                { "Krishna", "UK" },
	                { "Bhupesh", "USA" }
	            };}
	        else{
	        return new Object[][] {
	                { "Canada" },
	                { "Russia" },
	                { "Japan" }
	            };}       
	    }
}
