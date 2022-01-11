package com.LW.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class backend {
	

	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement adminlogin;

	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement adminpassword;

	@FindBy(xpath="//button[.=\"Sign in\"]")
	private WebElement adminloginbutton;

	@FindBy(xpath = "//a[.=\"My Account\"]")
	private WebElement MyAccount;

	@FindBy(xpath = "(//a[@class=\"edit_product_que\"])[1]")
	private WebElement EQues;
	
	@FindBy(xpath = "//a[.=\"STEP 1\"]")
	private WebElement STEP;
	
	@FindBy(xpath = "(//button[.=\"Exit\"])[2]")
	private WebElement Exit;
	
	@FindBy(xpath = "//a[.=\">>\"]")
	private WebElement lastpage;
	
	@FindBy(xpath = "(//a[@class=\"edit_product_que\"])[1]")
	private WebElement EQues2;
	
	@FindBy(xpath = "//a[.=\"STEP 1\"]")
	private WebElement STEP2;
	
	@FindBy(xpath = "(//button[.=\"Exit\"])[2]")
	private WebElement Exit2;
	
	@FindBy(xpath = "(//a[.=\"Document\"])[1]")
	private WebElement Document;
	
	@FindBy(xpath = "//button[.=\"Exit\"]")
	private WebElement DocumentExit;
	
	@FindBy(xpath = "//span[@class=\"logoe\"]")
	private WebElement logo;
	
	
	
	public backend(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

	public void adminlogin(String un, String pw) {

		adminlogin.sendKeys(un);
		adminpassword.sendKeys(pw);
		adminloginbutton.click();
	}
	
	public void myaccount() {
		MyAccount.click();
	}
	
	public void EQuestionnaire() {
	
	EQues.click();
	STEP.click();
	Exit.click();
	
	}
	
	public void OldDocumentEQuestionnaire() throws InterruptedException {
		
		lastpage.click();
		
		EQues2.click();
		
		Thread.sleep(2000);
		
		STEP2.click();
		
		Exit2.click();
		
		
	}
	
	public void Document() throws InterruptedException {
	
		Document.click();
		DocumentExit.click();
		logo.click();
}
	public void Home() throws InterruptedException {
		
		logo.click();
}}

