package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonTabs{ 

	public HomePage() {
       PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogout;
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA") WebElement eleCRMSFA;	
	
	
	public LoginPage clickLogout() {
		click(eleLogout);  
		return new LoginPage();
	}
	
	public MyHomePage clickCRMSFA() {
		click(eleCRMSFA);  
		return new MyHomePage();

	}
	
	

}







