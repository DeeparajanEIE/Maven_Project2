package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	public WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement select_HotelBtn;
	@FindBy(id="continue")
	private WebElement cotinue_Btn;
	public Select_Hotel_Page (WebDriver driver1){
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		;
	}
	public WebElement getSelect_HotelBtn() {
		return select_HotelBtn;
	}
	public WebElement getCotinue_Btn() {
		return cotinue_Btn;
	}

}
