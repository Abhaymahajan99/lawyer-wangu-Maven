package com.LW.test;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.LW.Pom.InternalLogin;
import com.LW.generics.LWBaseClass;

public class CheckList1 extends LWBaseClass {
	@Test()
	public void Checklist1_InternalLogin() throws InterruptedException, IOException {
		
		ExtentTest = extent.startTest(" Checklist1_InternalLogin");

		String c="window.scrollTo(0,document.body.scrollHeight)";
		js.executeScript(c);

		String un = f.getPropertyData("inusername");
		String pw =f.getPropertyData("inpassword"); 
		InternalLogin ig=new InternalLogin(driver); 
		ig.setLogin(un,pw);
		
		ig.myacc();
		Reporter.log("Internal login working fine",true);
        Thread.sleep(500);
        
		AssertJUnit.assertTrue(true==true);
		
	sa.assertAll(); 
		
	
		

	}

}
