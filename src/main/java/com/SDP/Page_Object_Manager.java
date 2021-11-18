package com.SDP;

import org.openqa.selenium.WebDriver;

import com.POM.Casualdress_Page;
import com.POM.Conform_Order_MystorePage;
import com.POM.Home_Page;
import com.POM.Login_Page;
import com.POM.Myaccount_page;
import com.POM.Order_Address_Page;
import com.POM.Order_Page;
import com.POM.Order_Payment_Page;
import com.POM.Order_Shipping_Page;

public class Page_Object_Manager {
	public WebDriver driver;
	private Home_Page hp;
	private Login_Page lp;
	private Myaccount_page mp;
	private Casualdress_Page cp;
	private Order_Page op;
	private Order_Address_Page oap;
	private Order_Shipping_Page osp;
	private Order_Payment_Page opp;
	private Conform_Order_MystorePage com;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Home_Page getInstanceHp() {
		if(hp==null){
			hp=new Home_Page(driver);
		}
		return hp;		
	}
	public  Login_Page getInstanceLp() {
		if(lp==null){
			lp=new Login_Page(driver);
		}
		return lp;		
	}
	public Myaccount_page getInstanceMp() {
		if(mp==null){
			mp=new Myaccount_page(driver);
		}
		return mp;		
	}
	public Casualdress_Page getInstanceCp() {
		if(cp==null){
			cp=new Casualdress_Page(driver);
		}
		return cp;		
	}
	public Order_Page getInstanceOp() {
		if(op==null){
			op=new Order_Page(driver);
		}
		return op;		
	}
	public Order_Address_Page getInstanceOap() {
		if(oap==null){
			oap=new Order_Address_Page(driver);
		}
		return oap;		
	}
	public Order_Shipping_Page getInstanceOsp() {
		if(osp==null){
			osp=new Order_Shipping_Page(driver);
		}
		return osp;		
	}
	public Order_Payment_Page getInstanceOpp() {
		if(opp==null){
			opp=new Order_Payment_Page(driver);
		}
		return opp;		
	}
	public Conform_Order_MystorePage getInstanceCom() {
		if(com==null){
			com=new Conform_Order_MystorePage(driver);
		}
		return com;		
	}

}
