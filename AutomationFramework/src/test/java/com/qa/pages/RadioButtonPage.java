package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RadioButtonPage {

	 WebDriver driver;
		// Page object Repository - Elements located using @FindBy annotation
		
	 // Elements to launch text box page 
		
		@FindBy(xpath = "//div[@class='category-cards']/child::div[1]")
		WebElement elementsButton;

		@FindBy(xpath = "//span[text()='Radio Button']")
		WebElement RadioButton;

	    // Radio Button to be selected
		@FindBy(xpath="//label[@for='yesRadio']")
		WebElement Radio1;
		
		@FindBy(xpath="//label[@for='impressiveRadio']")
		WebElement Radio2;
		
			
		@FindBy(xpath="//label[@for='noRadio']")
		WebElement Radio3;
		
		// Elements and labels of radioButton
		// Radio Button to be selected
		@FindBy(xpath="//span[@class='text-success']")
		WebElement OutputRadio;
				
		//Page class constructor 
		
		public RadioButtonPage(WebDriver driver){
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		}
				
		// Page operation Methods
				
		// Operation#1 - Launching page 

		  public void launchRadioButtonPage() throws InterruptedException {
			Thread.sleep(5000);
			elementsButton.click();
			RadioButton.click();
			Thread.sleep(5000);
		}
		  
		// Operation#2 - passing data to  Submit form 
			
			public void RadioButton1Selection() throws InterruptedException{
				
				Radio1.click();
				Thread.sleep(5000);
			}	
            public void RadioButton2Selection() throws InterruptedException{
				
				Radio2.click();
				Thread.sleep(5000);
			}
           public void RadioButton3Selection() throws InterruptedException{
				
				Radio3.click();
				Thread.sleep(5000);
			}
		
		
		//Operation 3 - Get the data to verify   
		  public String RadioSelected(){
				
				return OutputRadio.getText();
			}
			
			
			
}
