package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.CommonTabs;
import com.selbot.pages.LoginPage;

public class TC004_DeleteLead extends CommonTabs{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC004_DeleteLead";
		testcaseDec = "Login, Delete Lead and Verify";
		author = "Sathish Babu";
		category = "Assignment";
		excelFileName = "TC004";
	} 

	@Test(dataProvider="fetchData") 
	public void deleteLead(String uName, String pwd)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLead()
		.getFirstLeadID()
		.clickFirstLead()
		.clickDeleteButton()
		.clickLeadsTab()
		.clickFindLead()
		.enterFirstLeadIDAndSearch()
		.verifyNoRecords();
	}


}
