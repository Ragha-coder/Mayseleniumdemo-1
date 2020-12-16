package com.seleniumprograms.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Test
	@Parameters({ "fullname", "lastname", "firstname", "emailId" })
	public void tc1(@Optional("ACD") String fullname, String lastname, String firstname, String emailId) {

		System.out.println("my lastname  :" + lastname);

		System.out.println("my lastname  :" + firstname);

		System.out.println("my lastname  :" + fullname);

		System.out.println("my lastname  :" + emailId);
	}

}
