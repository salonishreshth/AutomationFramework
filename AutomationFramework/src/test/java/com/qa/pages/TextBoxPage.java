package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {			
		
	    WebDriver driver;
		// Page object Repository - Elements located using @FindBy annotation
		
	 // Elements to launch text box page 
		
		@FindBy(xpath = "//div[@class='category-cards']/child::div[1]")
		WebElement elementsButton;

		@FindBy(xpath = "//span[text()='Text Box']")
		WebElement TextboxButton;

	    // Element to submit form
		
		@FindBy(xpath="//input[@id='userName']")
		WebElement fullNameTextBox;
		
		@FindBy(xpath = "//input[@id='userEmail']")
		WebElement emailTextBox;

		@FindBy(xpath = "//textarea[@id='currentAddress']")
		WebElement currrentAddressTextBox;

		@FindBy(xpath = "//textarea[@id='permanentAddress']")
		WebElement permAdressTextBox;

		@FindBy(id = "submit")
		WebElement submitButton;

		// Elements to get submitted details

		@FindBy(xpath = "//p[@id='name']")
		WebElement outputName;

		@FindBy(xpath = "//p[@id='email']")
		WebElement OutputEmail;

		@FindBy(xpath = "//p[@id='currentAddress']")
		WebElement OutputcurrAdddress;

		@FindBy(xpath = "//p[@id='permanentAddress']")
		WebElement OutputpermAdddress;
		
		//Page class constructor 
		
		public TextBoxPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		// Page operation Methods
		
		// Operation#1 - Launching page 

		public void launchTextBoxPage() throws InterruptedException {
			Thread.sleep(5000);
			elementsButton.click();
			TextboxButton.click();
			Thread.sleep(5000);

		}
		// Operation#2 - passing data to  Submit form 
		
		public void submitForm(String fullName, String email, String currAddress, String permAddress) throws InterruptedException{
			Thread.sleep(5000);
			fullNameTextBox.sendKeys(fullName);
			emailTextBox.sendKeys(email);
			currrentAddressTextBox.sendKeys(currAddress);
			permAdressTextBox.sendKeys(permAddress);
			Thread.sleep(5000);
			submitButton.click();
			Thread.sleep(5000);
		}		
	
	//Operation 3 - Get the data to verify 
		
		public String getOutputFullName(){
			
			return outputName.getText();
		}
		
		
		public String getOutputEmail(){
			return OutputEmail.getText();
		}
		
		public String getCrrentAddress(){
			
			return OutputcurrAdddress.getText();
		}
		
		
		public String getPermAddress(){
			return OutputpermAdddress.getText();
			
		}

		


	}


