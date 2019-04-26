package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.ErailHomePage;
import com.selbot.testng.api.base.Annotations;

public class Erail001_GetTrainSeats extends Annotations {

	@BeforeTest
	public void setData() {
		testcaseName = "Erail001_GetTrainSeats";
		testcaseDec = "Get Train Seat Counts";
		author = "Sathish Babu";
		category = "HomeAssignment";
		excelFileName = "Erail001";
	}

	@Test(dataProvider = "fetchData")
	public void getTrainSeat(String fromStation, String toStation,String trainName) {
		new ErailHomePage()
		.enterFromStation(fromStation)
		.enterToStation(toStation)
		.uncheckTrainOnlyOnDate()
		.getTrainSeats(trainName);
	}

}
