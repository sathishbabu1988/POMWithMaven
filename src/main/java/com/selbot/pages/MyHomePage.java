package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage extends CommonTabs{
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Leads")  WebElement eleLeads;


	public MyLeadPage clickLeads() {
		click(eleLeads);
		return new MyLeadPage();
	}






}
