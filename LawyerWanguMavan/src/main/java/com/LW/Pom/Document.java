package com.LW.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document {
	
	@FindBy(xpath="//input[@placeholder=\"Enter name as it appears on Identity Document\"]")
	private WebElement FullName;
	
	@FindBy(xpath="//input[@placeholder=\"Enter the amont\"]")
	private WebElement Amount;
	
	@FindBy(name="next")
	private WebElement nextbutton;
	
	@FindBy(xpath="//input[@value=\"Proceed to Purchase\"]")
	private WebElement ProceedtoPurchaseButton;
	
	@FindBy(xpath = "(//a[.=\"Edit\"])[1]")
	private WebElement Edit;
	
	@FindBy(xpath = "//div[@class=\"A4\"]")
	private WebElement canvasPage;
	
	@FindBy(xpath = "//a[.=\"My Account\"]")
	private WebElement MyAccount;

	public Document(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	public void Doc() throws InterruptedException {
		
		FullName.sendKeys("Test user");
		Amount.sendKeys("5000");
		nextbutton.click();
		Thread.sleep(2000);
	}
	public void ProceedtoPurchaseButton() throws InterruptedException {
		ProceedtoPurchaseButton.click();
		Thread.sleep(1000);
		
		
	}
		public void Edit() throws InterruptedException {	
			Edit.click();
		
			if (canvasPage.isDisplayed()) {
				String text = canvasPage.getText();
			System.out.println(" Priview text:  "+text);
		
}}
			public void MyAccount() throws InterruptedException {
		
		MyAccount.click();
			}

}
	
