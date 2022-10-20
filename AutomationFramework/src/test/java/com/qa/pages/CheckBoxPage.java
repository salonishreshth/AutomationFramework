package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

	 WebDriver driver;
	 
	 // Page object Repository - Elements located using @FindBy annotation
		
	 // Elements to launch text box page 
		
		@FindBy(xpath = "//div[@class='category-cards']/child::div[1]")
		WebElement elementsButton;
		
		@FindBy(xpath = "//span[text()='Check Box']")
		WebElement CheckboxButton;
		
		// Elements to Checkbox
		
		@FindBy(xpath="//button[@title='Expand all']")
		WebElement ExpandAll;
		
		@FindBy(xpath="//button[@title='Collapse all']")
		WebElement CollapseAll;
		
		// Elements and labels of checkbox
		
		@FindBy(xpath="//span[text()='Home']")
		WebElement CheckBoxHomeLabel;
			
	  //  @FindBy(xpath="//span[@class='rct-title']")
	//	WebElement CheckBoxHomeLabel;
	    
/*	    @FindBy(xpath="//span[text()='Desktop']")
		WebElement CheckBoxDesktopLabel;
			
	    @FindBy(xpath="//span[text()='Notes']")
		WebElement CheckBoxNotesLabel;
	    
	    @FindBy(xpath="//span[text()='Commands']")
		WebElement CheckBoxCommandsLabel;
			
	    @FindBy(xpath="//span[text()='Documents']")
		WebElement CheckBoxDocumentsLabel;
	    
	    @FindBy(xpath="//span[text()='WorkSpace']")
		WebElement CheckBoxWorkSpaceLabel;
			
	    @FindBy(xpath="//span[text()='React']")
		WebElement CheckBoxReactLabel;
	    
	    @FindBy(xpath="//span[text()='Angular']")
		WebElement CheckBoxAngularLabel;
	    
	    @FindBy(xpath="//span[text()='Veu']")
		WebElement CheckBoxVeuLabel;
	    
	    @FindBy(xpath="//span[text()='Office']")
		WebElement CheckBoxOfficeLabel;
	    
	    @FindBy(xpath="//span[text()='Public']")
		WebElement CheckBoxPublicLabel;
	    
	    @FindBy(xpath="//span[text()='Private']")
		WebElement CheckBoxPrivateLabel;
	    
	    @FindBy(xpath="//span[text()='Classified']")
		WebElement CheckBoxClassifiedLabel;
	    
	    @FindBy(xpath="//span[text()='General']")
		WebElement CheckBoxGeneralLabel;
	    
	    @FindBy(xpath="//span[text()='Downloads']")
		WebElement CheckBoxDownloadsLabel;
	    
	    @FindBy(xpath="//span[text()='Word File.doc']")
		WebElement CheckBoxWordFileLabel;
	    
	    @FindBy(xpath="//span[text()='Excel File.doc']")
		WebElement CheckBoxExcelFileLabel;  */
	    
	    
	 // Elements to get submitted details

	 	@FindBy(xpath = "//span[@class='rct-checkbox']/following::svg")
	 	WebElement CheckBoxHome;

	/* 	@FindBy(xpath="//input[@id='tree-node-desktop']")
		WebElement OutputDesktop;
			
	    @FindBy(xpath="//input[@id=tree-node-notes']")
		WebElement OutputNotes;
	    
	    @FindBy(xpath="//input[@id='tree-node-commands']")
		WebElement OutputCommands;
			
	    @FindBy(xpath="//input[@id='tree-node-documents]")
		WebElement OutputDocuments;
	    
	    @FindBy(xpath="//input[@id='tree-node-workspace']")
		WebElement OutputWorkSpace;
			
	    @FindBy(xpath="//input[@id='tree-node-react']")
		WebElement OutputReact;
	    
	    @FindBy(xpath="//input[@id='tree-node-angular']")
		WebElement OutputAngular;
	    
	    @FindBy(xpath="//input[@id='tree-node-veu']")
		WebElement OutputBoxVeu;
	    
	    @FindBy(xpath="//input[@id='tree-node-office']")
		WebElement OutputOffice;
	    
	    @FindBy(xpath="//input[@id='tree-node-public']")
		WebElement OutputPublic;
	    
	    @FindBy(xpath="//input[@id='']")
		WebElement OutputPrivate;
	    
	    @FindBy(xpath="//input[@id='']")
		WebElement OutputClassified;
	    
	    @FindBy(xpath="//input[@id='']")
		WebElement OutputGeneral;
	    
	    @FindBy(xpath="//input[@id='']")
		WebElement OutputDownloads;
	    
	    @FindBy(xpath="//input[@id='']")
		WebElement OutputWordFile;
	    
	    @FindBy(xpath="//input[@id='']")
		WebElement OutputExcelFile;*/
	    
	 		
	 	//Page class constructor 
	 		
	 	public CheckBoxPage(WebDriver driver){
	 	this.driver=driver;
	 	PageFactory.initElements(driver, this);
	 	}
	 	
	 // Page operation Methods
		
	 		// Operation#1 - Launching page 

	 		public void launchCheckBoxPage() throws InterruptedException {
	 			Thread.sleep(5000);
	 			elementsButton.click();
	 			CheckboxButton.click();
	 			Thread.sleep(5000);

	 		}
	 		// Operation#2 - passing data to  CheckBox Method 
	 		
	 		public void getExpandAll(){
	 			 ExpandAll.click();
	 		}
	 		
	 		public void getCollapseAll(){
	 			 CollapseAll.click();
	 		}
	 		public void getCheckHome(){
	 			 CheckBoxHome.click();
	 		}
	 		
	 	
	 	//Operation 3 - Get the checkbox to verify 
	 		
	 		
	 		public void getOutputExpandAll(){
				
				 System.out.println("Expanded");
			}
	 		
	 		public void getOutputCollapseAll(){
				
				 System.out.println("Collapsed");
			}
			
	 		public void IsHomeCheckBoxSelected(){
				
				 System.out.println("Home");
			}
			
			
			
				
	 			    
	   
	   
	    
	    
}
