package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DuplicateLeadPage extends CommonTabs{
	
	public DuplicateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="createLeadForm_dataSourceId")
	WebElement eleSourceDropDown;
	
	@FindBy(how=How.CLASS_NAME , using="smallSubmit")
	WebElement eleCreateLead;
	
	public DuplicateLeadPage selectSourceForDuplicate(String text)
	{
		selectDropDownUsingText(eleSourceDropDown, text);
		return this;
	}
	
	public ViewLeadPage clickCreateLead()
	{
		click(eleCreateLead);
		return new ViewLeadPage();
	}

}
