package com.comcast.createcontactsTest;

import org.testng.annotations.Test;

public class TC_01_ContactsTest {

	@Test
	public void createout()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("url");
		System.out.println(URL);
	}
	
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
