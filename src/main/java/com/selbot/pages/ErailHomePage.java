package com.selbot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.selbot.utils.StringUtils;

import com.selbot.testng.api.base.Annotations;

public class ErailHomePage extends Annotations {

	public ErailHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "txtStationFrom")
	WebElement eleFromStation;
	@FindBy(how = How.ID, using = "txtStationTo")
	WebElement eleToStation;
	@FindBy(how = How.ID, using = "chkSelectDateOnly")
	WebElement eleTrainOnlyCheckBox;
	@FindBy(how = How.XPATH, using = "//table[@class='DataTable TrainList']")
	WebElement eleTrainTable;

	public ErailHomePage enterFromStation(String value) {
		clearAndType(eleFromStation, value);
		performTabPress(eleFromStation);
		return this;
	}

	public ErailHomePage enterToStation(String value) {
		clearAndType(eleToStation, value);
		performTabPress(eleToStation);
		return this;
	}

	public ErailHomePage uncheckTrainOnlyOnDate() {
		click(eleTrainOnlyCheckBox);
		return this;
	}

	public ErailHomePage getTrainSeats(String trainName) {
		StringUtils utils = new StringUtils();
		String[] trainClasses = utils.getRequiredTrainClasses(trainName);
		String[] trainClassHeaders = utils.getTrainHeaders();
		if (trainClasses.length == trainClassHeaders.length) {
			for (int i = 0; i < trainClasses.length; i++) {
				System.out.println(trainClassHeaders[i] + " : " + trainClasses[i]);
			}
		}
		return this;
	}

}
