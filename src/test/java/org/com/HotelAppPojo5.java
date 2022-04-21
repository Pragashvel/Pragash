package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelAppPojo5 extends BaseClass{
	public HotelAppPojo5() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
		 @FindBy(id="logou"),
		 @FindBy(name="logout")
		 })
     private WebElement btnLogout;

	public WebElement getBtnLogout() {
		return btnLogout;
	}
	 }
