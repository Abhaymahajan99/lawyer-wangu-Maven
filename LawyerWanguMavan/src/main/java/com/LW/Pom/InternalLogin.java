package com.LW.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalLogin {


	@FindBy(xpath="//a[.=\"Corporate Login\"]")
	private WebElement Internal ;

	@FindBy(xpath="//input[@name=\"login_username\"]")
	private WebElement login;

	@FindBy(xpath="//input[@name=\"login_password\"]")
	private WebElement password;

	@FindBy(xpath="//button[@id=\"login_button\"]")
	private WebElement loginbutton;

	@FindBy(xpath = "//a[.=\"My Account\"]")
	private WebElement MyAccount;

	public InternalLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public void setLogin(String un, String pw) {

		Internal.click();
		login.click();
		login.sendKeys(un);
		password.sendKeys(pw);
		loginbutton.click();
	}
	public void myacc() {

		MyAccount.click();

	}}