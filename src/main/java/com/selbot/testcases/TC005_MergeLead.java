package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.CommonTabs;
import com.selbot.pages.LoginPage;

public class TC005_MergeLead extends CommonTabs {

	@BeforeTest
	public void setData() {
		testcaseName = "TC005_MergeLead";
		testcaseDec = "Login, Merge Leads and Verify";
		author = "Sathish Babu";
		category = "Assignment";
		excelFileName = "TC005";
	}

	@Test(dataProvider = "fetchData")
	public void deleteLead(String uName, String pwd, String fName1, String fName2) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickMergeLead()
		.selectFromLeadToMerge()
		.enterFirstNameAndSearch(fName1)
		.selectFirstResultAndSwitchParentWindow()
		.selectToLeadToMerge()
		.enterFirstNameAndSearch(fName2);
	}

}
