package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditLeadPage extends CommonTabs{

	public EditLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="updateLeadForm_firstName")
	WebElement eleUpdateFirstName;
	
	@FindBy(how=How.CLASS_NAME , using="smallSubmit")
	WebElement eleUpdateButton;
	
	public EditLeadPage updateFirstName(String fname)
	{
		clearAndType(eleUpdateFirstName, fname);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton()
	{
		click(eleUpdateButton);
		return new ViewLeadPage();
	}

}
