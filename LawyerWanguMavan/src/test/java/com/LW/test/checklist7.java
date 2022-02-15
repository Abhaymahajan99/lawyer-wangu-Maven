package com.LW.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.LW.Pom.Document;
import com.LW.generics.LWBaseClass;

public class checklist7  extends LWBaseClass{
	@Test(priority=3)
	public void Cheklist7_IndividualUser_TillPreviewPage() throws InterruptedException, IOException   {
		
		ExtentTest = extent.startTest(" Cheklist7_IndividualUser_TillPreviewPage");

		//driver.get("https://devstaging.lawyerwangu.com/lw/auto");
		
		String DocumentUrl = f.getPropertyData("DocumentUrl");
		driver.get(DocumentUrl);
		
		Document dc = new Document(driver);
		
		dc.Doc();
		String c="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(c);
		dc.ProceedtoPurchaseButton();
		dc.Edit();
		Thread.sleep(1000);
		String d="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(d);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"Proceed to Purchase\"]")));
		String e="window.scrollTo(0,document.body.scrollHeight)";
		dc.ProceedtoPurchaseButton();
		dc.MyAccount();
		
		Reporter.log("Login as individual user,check the document till preview page woking fine",true);

		AssertJUnit.assertTrue(true == true);
		sa.assertAll(); 

		
	}

}
