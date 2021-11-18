package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out_Page {
	public WebDriver driver;
	@FindBy(id="logout")
	private WebElement logout_Btn;
	
	public Log_Out_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}

}
