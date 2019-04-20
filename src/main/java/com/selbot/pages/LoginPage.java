package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends CommonTabs{ 
	
	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how=How.ID, using="username")  WebElement eleUserName;
	@FindBy(how=How.ID, using="password")  WebElement elePassWord;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogin;
	
	@Given("Enter the Username as (.*)")
	public LoginPage enterUserName(String data) {
		clearAndType(eleUserName, data);  
		return this; 
	}
	
	
	@And("Enter the password as (.*)")
	public LoginPage enterPassWord(String data) {
		clearAndType(elePassWord, data); 
		return this; 
	}
	
	@When("Click on the login button")
	public HomePage clickLogin() {
		//WebElement eleLogin = locateElement("class", "decorativeSubmit");
          click(eleLogin);  
          return new HomePage();
	}
	
}







