package com.Test_Driven_Devlopment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set the Properties");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Launch the Browser");
	}

	@BeforeClass
	private void getUrl() {
		System.out.println("Get The Url");
	}

	@BeforeMethod
	private void sigin() {
		System.out.println("Signin Function");
	}

	@Test
	private void women() {
		System.out.println("Women page");
	}

	@AfterMethod
	private void signout() {
		System.out.println("Signout Function");
	}

	@AfterClass
	private void homePage() {
		System.out.println("Go to Home Page");
	}

	@AfterTest
	private void close() {
		System.out.println("Close the Tab");
	}

	@AfterTest
	private void quit() {
		System.out.println("Quit the Browser");
	}

	@Test
	private void men() {
		System.out.println("Men Page");
	}

	@Test
	private void tShirt() {
		System.out.println("T-Shirt Page");
	}
}
