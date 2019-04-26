package com.selbot.utils;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.selbot.testng.api.base.Annotations;

public class StringUtils extends Annotations{
	
	public String[] getRequiredTrainClasses(String trainName) {
		String singleClass = new String();
		int i = 0;
		List<WebElement> requiredTrainClasses = locateElements("xpath",
				"(//a[contains(text(),'" + trainName + "')])[1]//ancestor::tr[1]//td[@style='width:30px;']");
		String[] requiredClasses = new String[requiredTrainClasses.size()];
		for (WebElement singleClasses : requiredTrainClasses) {
			singleClass = getElementText(singleClasses);
			requiredClasses[i] = singleClass;
			i++;
		}
		return requiredClasses;
	}

	public String[] getTrainHeaders() {
		String singleClassHeader = new String();
		int i = 0;
		List<WebElement> trainClasses = locateElements("xpath",
				"//table[@class='DataTable DataTableHeader TrainList']//td[@style='width:30px;']");
		String[] trainClassHeaders = new String[trainClasses.size()];
		for (WebElement singleClass : trainClasses) {
			singleClassHeader = getElementText(singleClass);
			trainClassHeaders[i] = singleClassHeader;
			i++;
		}
		return trainClassHeaders;
	}

}
