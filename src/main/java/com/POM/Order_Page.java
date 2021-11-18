package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page {
	public WebDriver driver;
	@FindBy(xpath = "//input[@class='cart_quantity_input form-control grey']")
	private WebElement quantity_Enter_Box;
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed_To_Checkout_Btn;

	public Order_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuantity_Enter_Box() {
		return quantity_Enter_Box;
	}

	public WebElement getProceed_To_Checkout_Btn() {
		return proceed_To_Checkout_Btn;
	}

}
