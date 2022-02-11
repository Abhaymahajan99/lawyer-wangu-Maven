package com.LW.test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.LW.Pom.MyAccount;
import com.LW.generics.LWBaseClass;

public class CheckMyAccountUI extends LWBaseClass {
	@Test(priority=5)
	public void TestMyAccount() throws InterruptedException, IOException  { 
	ExtentTest = extent.startTest(" TestsMyAccount");
	
	Thread.sleep(500);
	
	MyAccount m= new MyAccount(driver);
	
	m.Details();
	Thread.sleep(500);

	m.Details2();
	
	// js.executeScript("window.scrollBy(0,-500)");

    m.Save();
   
	m.removecontect();
	Reporter.log("UI My Account detail",true);
}}


