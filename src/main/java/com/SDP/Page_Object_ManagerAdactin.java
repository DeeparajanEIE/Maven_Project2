package com.SDP;

import org.openqa.selenium.WebDriver;

import com.POM_Adactin.Book_A_Hotel_Page;
import com.POM_Adactin.Hotel_Booking_Conform_Page;
import com.POM_Adactin.Hotel_Reservation_Page;
import com.POM_Adactin.Log_Out_Page;
import com.POM_Adactin.Search_Hotel_Page;
import com.POM_Adactin.Select_Hotel_Page;

public class Page_Object_ManagerAdactin {
	public WebDriver driver;
	private  Hotel_Reservation_Page hrp;
	private Search_Hotel_Page shp;
	private Select_Hotel_Page shhp;
	private Book_A_Hotel_Page bahp;
	private Hotel_Booking_Conform_Page hbcp;
	private Log_Out_Page lop;
	public Page_Object_ManagerAdactin(WebDriver driver1) {
		this.driver=driver1;
	}
public  Hotel_Reservation_Page getInstance_ReservationPage() {
	if(hrp==null) {
		hrp=new  Hotel_Reservation_Page(driver);
	}
	return hrp;
}
public  Search_Hotel_Page getInstace_SearchPage() {
	if(shp==null) {
		shp=new  Search_Hotel_Page(driver);		
	}
	return shp;	
}
public Select_Hotel_Page getINstance_SelectionPage() {
	if(shhp==null) {
		shhp=new Select_Hotel_Page(driver);
	}
	return shhp;
}
public  Book_A_Hotel_Page getInstance_BookingPage() {
	if(bahp==null) {
		bahp=new  Book_A_Hotel_Page(driver);	
	}
	return bahp;
}
public Hotel_Booking_Conform_Page getInstance_ConformPage() {
	if(hbcp==null) {
		hbcp = new Hotel_Booking_Conform_Page(driver);
	}
	return hbcp;
}
public Log_Out_Page getInstance_LogoutPage() {
	if(lop==null) {
		lop=new Log_Out_Page(driver);
	}
	return lop;
}
}
