package com.freecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.utilities.BaseProject;

public class HomePage extends BaseProject {
	@FindBy(xpath = "//a[contains(text(),'Deals')]") WebElement dealsLink;
	@FindBy(xpath = "//a[contains(text(),'Contacts')]") WebElement contactsLink;
	@FindBy(xpath = "//a[@title='New Contact']") WebElement newContactLink;
	@FindBy(id = "first_name") WebElement firstName;
	@FindBy(xpath = "//input[@id='surname']") WebElement lastName;
	@FindBy(xpath = "//input[@value='Save']") WebElement saveButton;
	@FindBy(xpath = "//input[@name='nickname']") WebElement nickName;
	@FindBy(xpath = "//input[@id='company_position']") WebElement Position;
	@FindBy(xpath = "//input[@id='department']") WebElement Department;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewContactLink() throws InterruptedException {
		Actions action = new Actions(driver);
		driver.switchTo().frame("mainpanel");
		action.moveToElement(driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	}
	
	public void firstName() {
		 firstName.sendKeys("wuikhan");
	}
	public void lastName() {
		lastName.sendKeys("Khan");
	}
	
	public void clickSave() {
		saveButton.click();
	}
	
	public void nickName () {
		nickName.sendKeys("Waqas");
	}
	
	public void Position() {
		Position.sendKeys("QA");
	}
	
	public void Department() {
		Department.sendKeys("IT");
	}
	
	
	
	
}
