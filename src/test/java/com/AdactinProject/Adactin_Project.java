package com.AdactinProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass1;
import com.File_Reader.File_Reader_Manager;
import com.SDP.Page_Object_ManagerAdactin;

public class Adactin_Project extends BaseClass1 {
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Object_ManagerAdactin pom1 = new Page_Object_ManagerAdactin(driver);
	static Logger log = Logger.getLogger(Adactin_Project.class);

	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Get the URL");
		String url1 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL1();
		getURL(url1);
		log.info("Enter the Signin Credentials in Reservation Page");
		String username = testDataExcel("C:\\Users\\dell\\Desktop\\Adactin Testcases.xlsx", 0, 2, 5);
		sendKeys(pom1.getInstance_ReservationPage().getUsename(), username);
		String password = testDataExcel("C:\\Users\\dell\\Desktop\\Adactin Testcases.xlsx", 0, 3, 5);
		sendKeys(pom1.getInstance_ReservationPage().getPassword(), password);
		click(pom1.getInstance_ReservationPage().getLogin_Btn());
		log.info("Search the Hotel in Search Hotel Page");
		click(pom1.getInstace_SearchPage().getSelect_Location());
		dropDown(pom1.getInstace_SearchPage().getSelect_Location(), "byvalue", "New York");
		click(pom1.getInstace_SearchPage().getSelect_Hotel());
		dropDown(pom1.getInstace_SearchPage().getSelect_Hotel(), "byvisibletext", "Hotel Creek");
		click(pom1.getInstace_SearchPage().getSelect_Roomtype());
		dropDown(pom1.getInstace_SearchPage().getSelect_Roomtype(), "byindex", "3");
		click(pom1.getInstace_SearchPage().getSelect_NumberOfRooms());
		dropDown(pom1.getInstace_SearchPage().getSelect_NumberOfRooms(), "byvalue", "3");
		clearTextBox(pom1.getInstace_SearchPage().getCheck_In_Date());
		String inDate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInDate();
		sendKeys(pom1.getInstace_SearchPage().getCheck_In_Date(), inDate);
		clearTextBox(pom1.getInstace_SearchPage().getCheck_Out_Date());
		String outDate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getOutDate();
		sendKeys(pom1.getInstace_SearchPage().getCheck_Out_Date(), outDate);
		click(pom1.getInstace_SearchPage().getSelect_AdultPerRoom());
		dropDown(pom1.getInstace_SearchPage().getSelect_AdultPerRoom(), "byindex", "1");
		click(pom1.getInstace_SearchPage().getSelect_ChildrenPerRoom());
		dropDown(pom1.getInstace_SearchPage().getSelect_ChildrenPerRoom(), "byindex", "0");
		click(pom1.getInstace_SearchPage().getSearch_Btn());
		log.info("Select the Hotel in Select Hotel Page");
		click(pom1.getINstance_SelectionPage().getSelect_HotelBtn());
		click(pom1.getINstance_SelectionPage().getCotinue_Btn());
		log.info("Enter the Credentials in Book A Hotel Page");
		String firstName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstName();
		sendKeys(pom1.getInstance_BookingPage().getFirst_Name(), firstName);
		String lastName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		sendKeys(pom1.getInstance_BookingPage().getLast_Name(), lastName);
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		sendKeys(pom1.getInstance_BookingPage().getBilling_Address(), address);
		String ccNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCCNumber();
		sendKeys(pom1.getInstance_BookingPage().getCc_Number(), ccNumber);
		click(pom1.getInstance_BookingPage().getSelect_CC_Type());
		dropDown(pom1.getInstance_BookingPage().getSelect_CC_Type(), "byindex", "3");
		click(pom1.getInstance_BookingPage().getSelect_ExpMonth());
		dropDown(pom1.getInstance_BookingPage().getSelect_ExpMonth(), "byvisibletext", "December");
		click(pom1.getInstance_BookingPage().getSelect_ExpYear());
		dropDown(pom1.getInstance_BookingPage().getSelect_ExpYear(), "byvalue", "2022");
		String cvvNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCVVNumber();
		sendKeys(pom1.getInstance_BookingPage().getCvv_Number(), cvvNumber);
		click(pom1.getInstance_BookingPage().getBook_NowBtn());
		log.info("Conformation the Hotel Booking in Conform Page");
		explicitWait(30, pom1.getInstance_ConformPage().getMy_ltinerary_Btn());
		click(pom1.getInstance_ConformPage().getMy_ltinerary_Btn());
		takeScreenshot("snap2");
		log.info("Logout the Account  in Select Hotel Page");
		click(pom1.getInstance_LogoutPage().getLogout_Btn());
		quit();

	}

}