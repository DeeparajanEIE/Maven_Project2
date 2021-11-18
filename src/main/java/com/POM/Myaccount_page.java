package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount_page {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
	private WebElement casual_Dress;

	public Myaccount_page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasual_Dress() {
		return casual_Dress;
	}

}
