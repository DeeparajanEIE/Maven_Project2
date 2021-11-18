package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Reservation_Page {
	public WebDriver driver;
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login_Btn;

	public Hotel_Reservation_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsename() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin_Btn() {
		return login_Btn;
	}
}
