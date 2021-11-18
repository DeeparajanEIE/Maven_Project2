package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel_Page {
	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement first_Name ;
	@FindBy(id="last_name")
	private WebElement last_Name;
	@FindBy(id="address")
	private WebElement billing_Address ;
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cc_Number;
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement select_CC_Type;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement select_ExpMonth;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement Select_ExpYear ;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv_Number;
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book_NowBtn;
	public Book_A_Hotel_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirst_Name() {
		return first_Name;
	}
	public WebElement getLast_Name() {
		return last_Name;
	}
	public WebElement getBilling_Address() {
		return billing_Address;
	}
	public WebElement getCc_Number() {
		return cc_Number;
	}
	public WebElement getSelect_CC_Type() {
		return select_CC_Type;
	}
	public WebElement getSelect_ExpMonth() {
		return select_ExpMonth;
	}
	public WebElement getSelect_ExpYear() {
		return Select_ExpYear;
	}
	public WebElement getCvv_Number() {
		return cvv_Number;
	}
	public WebElement getBook_NowBtn() {
		return book_NowBtn;
	}

}
