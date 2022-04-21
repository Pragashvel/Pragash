package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HotelAppPojo1 extends BaseClass {
	public HotelAppPojo1() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
	@FindBy(id="username"),
	@FindBy(name="username")
	})
     private WebElement txtUser;
	
	@CacheLookup
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(name="password")
	})
     private WebElement txtPass;
	@CacheLookup
	@FindBys({
		@FindBy(id="login"),
		@FindBy(xpath="//input[@id='login']")
		})
      private WebElement btnLogin;
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
     
}
