package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conform_Order_MystorePage {
	public WebDriver driver;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement conform_Order_Btn;

	public Conform_Order_MystorePage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConform_Order_Btn() {
		return conform_Order_Btn;
	}

}
