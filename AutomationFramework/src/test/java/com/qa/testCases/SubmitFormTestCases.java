package com.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.TextBoxPage;
import com.qa.utilities.ReadExcel;

public class SubmitFormTestCases extends BaseClass{

	TextBoxPage objTextBoxPage;
	ReadExcel objReadExcel;

	@BeforeClass
	public void startBrowser() throws Exception, IOException, InterruptedException {
		driver =initializeDriver();
		objTextBoxPage= new TextBoxPage(driver);
		objReadExcel= new ReadExcel();

	}

	@Test
	public void VerifySubmitFormWithValidData() throws InterruptedException, NumberFormatException, IOException  {

		
		System.out.println("Selenium Code for this test case");
		objTextBoxPage.launchTextBoxPage();
		objTextBoxPage.submitForm(objReadExcel.getCellValue(3, 2), objReadExcel.getCellValue(3, 3),
		objReadExcel.getCellValue(3, 4), objReadExcel.getCellValue(3, 4));

		
		System.out.println(objTextBoxPage.getOutputFullName());
		
		System.out.println(objTextBoxPage.getOutputEmail());
		System.out.println(objTextBoxPage.getCrrentAddress());
		System.out.println(objTextBoxPage.getPermAddress());
		
		Assert.assertTrue(objTextBoxPage.getOutputFullName().contains("Sandip A"));

		Assert.assertTrue(objTextBoxPage.getOutputEmail().contains("saakolkar@gmail.com"));

		Assert.assertTrue(objTextBoxPage.getCrrentAddress().contains("Pune"));
		Assert.assertTrue(objTextBoxPage.getPermAddress().contains("Ahmednagar"));
	}


	@AfterClass
	public void closeBrowser() {
		closeAllDriver();
	}

}
