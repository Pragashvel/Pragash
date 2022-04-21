package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HotelAppPojo4 extends BaseClass {

	public HotelAppPojo4() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({ @FindBy(id = "first_name"), @FindBy(xpath = "//input[@id='first_name']") })
	private WebElement txtFirstname;

	@CacheLookup
	@FindAll({ @FindBy(id = "last_na"), @FindBy(name = "last_name") })
	private WebElement txtLastname;
	@CacheLookup
	@FindBys({ @FindBy(id = "address"), @FindBy(xpath = "//textarea[@id='address']") })
	private WebElement txtAddress;
	@CacheLookup
	@FindAll({ @FindBy(id = "cc_num"), @FindBy(name = "cc_n") })
	private WebElement txtCcnum;
	@CacheLookup
	@FindBys({ @FindBy(id = "cc_type"), @FindBy(xpath = "//select[@id='cc_type']") })
	private WebElement dropcctype;
	@CacheLookup
	@FindAll({ @FindBy(id = "cc_exp_month"), @FindBy(name = "cc_exp_mon") })
	private WebElement dropExmonth;
	@CacheLookup
	@FindBys({ @FindBy(id = "cc_exp_year"), @FindBy(xpath = "//select[@id='cc_exp_year']") })
	private WebElement dropExyear;
	@CacheLookup
	@FindAll({ @FindBy(id = "cc_cv"), @FindBy(name = "cc_cvv") })
	private WebElement txtCvv;
	@CacheLookup
	@FindBys({ @FindBy(id = "book_now"), @FindBy(xpath = "//input[@id='book_now']") })
	private WebElement btnBook;

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcnum() {
		return txtCcnum;
	}

	public WebElement getDropcctype() {
		return dropcctype;
	}

	public WebElement getDropExmonth() {
		return dropExmonth;
	}

	public WebElement getDropExyear() {
		return dropExyear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
}
