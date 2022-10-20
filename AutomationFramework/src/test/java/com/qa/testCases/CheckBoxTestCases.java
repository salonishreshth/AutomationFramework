package com.qa.testCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.CheckBoxPage;


public class CheckBoxTestCases extends BaseClass{
	CheckBoxPage objCheckBoxPage;

	@BeforeClass
	public void startBrowser() throws Exception, IOException, InterruptedException {
		driver =initializeDriver();
		objCheckBoxPage= new CheckBoxPage(driver);

	}

/*	@Test
	public void VerifyExpandAllOnPlusSelection() throws InterruptedException  {

		System.out.println("Selenium Code for this test case");
		objCheckBoxPage.launchCheckBoxPage();
		
		objCheckBoxPage.getExpandAll();
		
		objCheckBoxPage.getOutputExpandAll();
		
		Thread.sleep(5000);
	}
	
	@Test
	public void VerifyCollapseAllOnMinusSelection() throws InterruptedException  {

		objCheckBoxPage.getCollapseAll();
		
		objCheckBoxPage.getOutputCollapseAll();
		
		Thread.sleep(5000);
		
	} */
	
	@Test
	public void VerifyHomeSelection() throws InterruptedException  {

		objCheckBoxPage.getCheckHome();
				
	}
	

	@AfterClass
	public void closeBrowser() {
		closeAllDriver();
	}
}
