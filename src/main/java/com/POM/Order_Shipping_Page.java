package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Shipping_Page {
	public WebDriver driver;
	@FindBy(id = "cgv")
	private WebElement accept_Agreement;
	@FindBy(name = "processCarrier")
	private WebElement proceed_To_Checkout_Btn;

	public Order_Shipping_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccept_Agreement() {
		return accept_Agreement;
	}

	public WebElement getProceed_To_Checkout_Btn() {
		return proceed_To_Checkout_Btn;
	}

}
//a[@title='Back to orders']