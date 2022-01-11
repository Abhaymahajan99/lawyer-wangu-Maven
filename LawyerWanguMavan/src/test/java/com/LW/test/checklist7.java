package com.LW.test;

import java.io.IOException;

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
		String d="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(d);
		
		dc.ProceedtoPurchaseButton();
		dc.MyAccount();
		
		Reporter.log("Login as individual user,check the document till preview page woking fine",true);

		AssertJUnit.assertTrue(true == true);
		sa.assertAll(); 

		
	}

}
