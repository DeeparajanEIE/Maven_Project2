package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Payment_Page {
	public WebDriver driver;
	@FindBy(className="bankwire")
	private WebElement pay_By_Bankwire_Btn;

	public WebElement getPay_By_Bankwire_Btn() {
		return pay_By_Bankwire_Btn;
	}
	public Order_Payment_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

}
