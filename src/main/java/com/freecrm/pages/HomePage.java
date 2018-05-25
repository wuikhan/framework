package com.freecrm.pages;

import org.openqa.selenium.support.PageFactory;

import com.freecrm.utilities.BaseProject;

public class HomePage extends BaseProject {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
