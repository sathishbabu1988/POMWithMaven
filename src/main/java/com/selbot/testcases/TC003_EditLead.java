package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.selbot.pages.CommonTabs;
import com.selbot.pages.LoginPage;


public class TC003_EditLead extends CommonTabs{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC003_EditLead";
		testcaseDec = "Login, Edit Lead and Save";
		author = "Sathish Babu";
		category = "Assignment";
		excelFileName = "TC003";
	} 

	@Test(dataProvider="fetchData") 
	public void editLead(String uName, String pwd,String phoneNumber, String fname)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLead()
		.clickPhoneOption()
		.enterPhoneNumber(phoneNumber)
		.clickFirstLead()
		.clickEditButton()
		.updateFirstName(fname)
		.clickUpdateButton();
	}

}
