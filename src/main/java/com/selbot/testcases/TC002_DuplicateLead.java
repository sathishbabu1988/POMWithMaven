package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class TC002_DuplicateLead extends Annotations {

	@BeforeTest
	public void setData() {
		testcaseName = "TC002_DuplicateLead";
		testcaseDec = "";
		author = "Sathish Babu";
		category = "Training";
		excelFileName = "TC002";
	}

	@Test(dataProvider = "fetchData")
	public void duplicateLead(String uName, String pwd, String phoneNumber,String source) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhoneOption()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickDuplicateButton()
		.selectSourceForDuplicate(source)
		.clickCreateLead();
	
	}
}
