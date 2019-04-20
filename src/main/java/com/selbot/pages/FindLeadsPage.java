package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeadsPage extends CommonTabs {

	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static String firstLeadId;  
	public String textToBeVerified = "No records to display";

	@FindBy(how = How.XPATH, using = "//span[text()='Phone']")
	WebElement clickPhoneOption;
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber']")
	WebElement phoneNumberTextBox;
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	WebElement findLeadsButton;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement firstLeadLink;
	@FindBy(how = How.CLASS_NAME, using = "x-paging-info")
	WebElement eleNoRecordsText;
	@FindBy(how = How.XPATH, using = "//input[@name='id']")
	WebElement eleLeadIdTextbox;
	@FindBy(how = How.NAME, using = "firstName")
	WebElement eleFirstNameTextbox;

	public FindLeadsPage clickPhoneOption() {
		click(clickPhoneOption);
		return this;
	}

	public FindLeadsPage enterPhoneNumber(String phonenumber) {
		clearAndType(phoneNumberTextBox, phonenumber);
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() {
		click(findLeadsButton);
		return this;
	}

	public ViewLeadPage clickFirstLead() {
		click(firstLeadLink);
		return new ViewLeadPage();
	}
	
	public FindLeadsPage getFirstLeadID()
	{
		firstLeadId  = getElementText(firstLeadLink);
		return this;
	}
		
	public boolean verifyNoRecords()
	{
		return verifyExactText(eleNoRecordsText,textToBeVerified);
	}
	
	public FindLeadsPage enterFirstLeadIDAndSearch()
	{
		clearAndType(eleLeadIdTextbox, firstLeadId);
		click(findLeadsButton);
		return this;
	}
	
	public FindLeadsPage enterFirstNameAndSearch(String fName)
	{
		clearAndType(eleFirstNameTextbox, fName);
		return this;
	}
	
	public MergeLeadsPage selectFirstResultAndSwitchParentWindow()
	{
		click(firstLeadLink);
		firstLeadId  = getElementText(firstLeadLink);
		switchToWindow(0);
		return new MergeLeadsPage();
	}


}
