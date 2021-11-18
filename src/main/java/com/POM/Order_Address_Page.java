package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Address_Page {
	public WebDriver driver;
	@FindBy(name = "processAddress")
	private WebElement proceed_To_Checkout_Btn;

	public Order_Address_Page(WebDriver driver1) {
		this.driver = driver1;

		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed_To_Checkout_Btn() {
		return proceed_To_Checkout_Btn;
	}

}
