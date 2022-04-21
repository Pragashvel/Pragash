package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HotelAppPojo3 extends BaseClass {
	public HotelAppPojo3() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
		 @FindBy(id="radiobutton_0"),
		 @FindBy(name="radiobutton_")
		 })
     private WebElement btnRadio;
	@CacheLookup
	@FindBys({
		 @FindBy(id="continue"),
		 @FindBy(xpath="//input[@id='continue']")
		 })
     private WebElement btnContinue;
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
     
     }
