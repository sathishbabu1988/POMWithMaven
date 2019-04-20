package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyLeadPage extends CommonTabs{

	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.LINK_TEXT, using="Create Lead")  WebElement eleCreateLead;
	@FindBy(how=How.LINK_TEXT, using="Find Leads")  WebElement eleFindLead;
	@FindBy(how=How.LINK_TEXT, using="Merge Leads")  WebElement eleMergeLead;
	
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLead() {
		click(eleFindLead);
		return new FindLeadsPage();
	}

	public MergeLeadsPage clickMergeLead()
	{
		click(eleMergeLead);
		return new MergeLeadsPage();
	}



}
