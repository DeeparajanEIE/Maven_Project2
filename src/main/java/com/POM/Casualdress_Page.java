package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casualdress_Page {
	public WebDriver driver;
	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement printedDress;
	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement add_To_Cart_Btn;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed_To_Checkout_Btn;

	public Casualdress_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPrintedDress() {
		return printedDress;
	}

	public WebElement getAdd_To_Cart_Btn() {
		return add_To_Cart_Btn;
	}

	public WebElement getProceed_To_Checkout_Btn() {
		return proceed_To_Checkout_Btn;
	}

}
