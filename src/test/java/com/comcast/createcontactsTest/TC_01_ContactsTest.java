package com.comcast.createcontactsTest;

import org.testng.annotations.Test;

public class TC_01_ContactsTest {

	
	@Test(groups="Smoke")
	public void createContactTest()
	{
		System.out.println("Create contact");
	}
	
	
	
	@Test(groups="Smoke")
	public void createContactwithOrgTest()
	{
		System.out.println("Create contact with org");
	}
	
	
	@Test
	public void deleteContactTest()
	{
		System.out.println("delete contact");
	}
	
	@Test
	public void searchContactTest()
	{
		System.out.println("search contact");
	}
	
	
}
