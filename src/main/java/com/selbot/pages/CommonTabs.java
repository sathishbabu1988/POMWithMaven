package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class CommonTabs extends Annotations{
	
	public CommonTabs()
	{
		PageFactory.initElements(driver, this);
	}
	
	String textToBeVerified = "No records to display";
	
	@FindBy(how=How.LINK_TEXT,using="My Home")
	WebElement eleClickMyHomeTab;
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement eleClickLeadsTab;
	
	@FindBy(how=How.LINK_TEXT,using="Contacts")
	WebElement eleClickContactsTab;
	
	@FindBy(how=How.LINK_TEXT,using="Accounts")
	WebElement eleClickAccountsTab;
	
	@FindBy(how=How.LINK_TEXT,using="Cases")
	WebElement eleClickCasesTab;
	
	@FindBy(how=How.LINK_TEXT,using="Activities")
	WebElement eleClickActivitiesTab;
	
	@FindBy(how=How.LINK_TEXT,using="Opportunities")
	WebElement eleClickOpportunitiesTab;
	
	@FindBy(how=How.LINK_TEXT,using="Quotes")
	WebElement eleClickQuotesTab;
	
	@FindBy(how=How.LINK_TEXT,using="Orders")
	WebElement eleClickOrdersTab;
	
	@FindBy(how=How.LINK_TEXT,using="Forecasts")
	WebElement eleClickForecastsTab;
	
	@FindBy(how=How.LINK_TEXT,using="Marketing")
	WebElement eleClickMarketingTab;
	
	@FindBy(how=How.LINK_TEXT,using="Partners")
	WebElement eleClickPartnersTab;
	
	@FindBy(how=How.LINK_TEXT,using="Teams")
	WebElement eleClickTeamsTab;

	@FindBy(how=How.LINK_TEXT,using="Reports")
	WebElement eleClickReportsTab;

	@FindBy(how=How.LINK_TEXT,using="opentaps")
	WebElement eleClickopentapsTab;


	public MyHomePage clickMyhomeTab()
	{
		click(eleClickMyHomeTab);
		return new MyHomePage();
	}
	
	public MyLeadPage clickLeadsTab()
	{
		click(eleClickLeadsTab);
		return new MyLeadPage();
	}
	
	


}
