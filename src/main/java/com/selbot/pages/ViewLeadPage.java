package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends CommonTabs {

	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	WebElement eleCompanyName;
	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	WebElement eleDuplicateButton;
	@FindBy(how = How.LINK_TEXT, using = "Edit")
	WebElement eleEditButton;
	@FindBy(how = How.LINK_TEXT, using = "Delete")
	WebElement eleDeleteButton;

	public ViewLeadPage verifyCompanyName(String data) {
		String companyName = getElementText(eleCompanyName);
		if (companyName.contains(data)) {
			System.out.println("The Company Name is Matching Successfully ");
		} else {
			System.out.println("The Company Name is not Matching ");
		}
		return this;
	}

	public DuplicateLeadPage clickDuplicateButton() {
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
	}

	public EditLeadPage clickEditButton() {
		click(eleEditButton);
		return new EditLeadPage();
	}

	public MyLeadPage clickDeleteButton() {
		click(eleDeleteButton);
		return new MyLeadPage();
	}

}
