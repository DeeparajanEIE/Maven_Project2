package com.CofigrationReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configration_Reader {
	public static Properties p;

	public Configration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\properties\\Testdata.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getURL() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUserName() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getQuantity() {
		String quantity=p.getProperty("quantity");
		return quantity;
	}
	public String getScreenShotName() {
		String screenshotname=p.getProperty("screenshotname");
		return screenshotname;
	}
	public String getURL1() {
		String url = p.getProperty("url1");
		return url;
	}
	public String getUserName1() {
		String username = p.getProperty("username1");
		return username;
	}
	public String getPassword1() {
		String password = p.getProperty("password1");
		return password;
	}
	public String getFirstName() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String getLastName() {
		String lastname = p.getProperty("lastname");
		return lastname ;
	}
	public String getCCNumber() {
		String ccNumber = p.getProperty("ccnumber");
		return ccNumber;
	}
	public String getCVVNumber() {
		String cvvNumber = p.getProperty("cvvnumber");
		return cvvNumber;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getInDate() {
		String inDate = p.getProperty("indate");
		return inDate;
	}
	public String getOutDate() {
		String outDate = p.getProperty("outdate");
		return outDate;
	}
}
