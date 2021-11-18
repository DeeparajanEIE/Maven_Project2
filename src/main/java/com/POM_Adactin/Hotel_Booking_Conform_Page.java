package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Booking_Conform_Page {
	public WebDriver driver;
@FindBy(xpath="//input[@id='my_itinerary']")
private WebElement my_ltinerary_Btn;
public Hotel_Booking_Conform_Page(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
}
public WebElement getMy_ltinerary_Btn() {
	return my_ltinerary_Btn;
}
}
