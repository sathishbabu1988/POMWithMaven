package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MergeLeadsPage extends CommonTabs{

	public MergeLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using = "(//img[@alt='Lookup'])[1]") WebElement eleFromLeadImg;
	@FindBy(how=How.XPATH, using = "(//img[@alt='Lookup'])[2]") WebElement eleToLeadImg;
	
	public FindLeadsPage selectFromLeadToMerge()
	{
		click(eleFromLeadImg);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	public FindLeadsPage selectToLeadToMerge()
	{
		click(eleToLeadImg);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	
}
