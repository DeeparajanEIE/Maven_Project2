package com.POM_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	public WebDriver driver;
	@FindBy(id = "location")
	private WebElement select_Location;
	@FindBy(id = "hotels")
	private WebElement select_Hotel;
	@FindBy(id = "room_type")
	private WebElement select_Roomtype;
	@FindBy(id = "room_nos")
	private WebElement select_NumberOfRooms;
	@FindBy(id = "datepick_in")
	private WebElement check_In_Date;
	@FindBy(id = "datepick_out")
	private WebElement check_Out_Date;
	@FindBy(id = "adult_room")
	private WebElement select_AdultPerRoom;
	@FindBy(id = "child_room")
	private WebElement select_ChildrenPerRoom;
	@FindBy(id = "Submit")
	private WebElement search_Btn;

	public Search_Hotel_Page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSelect_Location() {
		return select_Location;
	}

	public WebElement getSelect_Hotel() {
		return select_Hotel;
	}

	public WebElement getSelect_Roomtype() {
		return select_Roomtype;
	}

	public WebElement getSelect_NumberOfRooms() {
		return select_NumberOfRooms;
	}

	public WebElement getCheck_In_Date() {
		return check_In_Date;
	}

	public WebElement getCheck_Out_Date() {
		return check_Out_Date;
	}

	public WebElement getSelect_AdultPerRoom() {
		return select_AdultPerRoom;
	}

	public WebElement getSelect_ChildrenPerRoom() {
		return select_ChildrenPerRoom;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}

	

}
