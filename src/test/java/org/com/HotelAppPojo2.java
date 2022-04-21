package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HotelAppPojo2 extends BaseClass {
	public HotelAppPojo2() {
		PageFactory.initElements(driver, this);
	    }
	@CacheLookup
	@FindBys({
		 @FindBy(id="location"),
		 @FindBy(xpath="//select[@id='location']")
		 })
	     private WebElement droploct;
	@CacheLookup
	@FindAll({
		 @FindBy(id="hotels"),
		 @FindBy(name="hotel")
		 })
	     private WebElement dropHotel;
	@CacheLookup
	@FindBys({
		 @FindBy(id="room_type"),
		 @FindBy(xpath="//select[@id='room_type']")
		 })
	     private WebElement dropRoom;
	@CacheLookup
	@FindAll({
		 @FindBy(id="room_nos"),
		 @FindBy(name="room_no")
		 })
	     private WebElement dropRoomNUm;
	@CacheLookup
	@FindBys({
		 @FindBy(id="adult_room"),
		 @FindBy(xpath="//select[@id='adult_room']")
		 })
	     private WebElement dropAdult;
	@CacheLookup
	@FindAll({
		 @FindBy(id="child_ro"),
		 @FindBy(name="child_room")
		 })
	      private WebElement dropChild;
	@CacheLookup
	@FindBys({
		 @FindBy(id="Submit"),
		 @FindBy(xpath="//input[@id='Submit']")
		 })
	     private WebElement btnSearch;
		public WebElement getDroploct() {
			return droploct;
		}
		public WebElement getDropHotel() {
			return dropHotel;
		}
		public WebElement getDropRoom() {
			return dropRoom;
		}
		public WebElement getDropRoomNUm() {
			return dropRoomNUm;
		}
		public WebElement getDropAdult() {
			return dropAdult;
		}
		public WebElement getDropChild() {
			return dropChild;
		}
		public WebElement getBtnSearch() {
			return btnSearch;
		}
	      }
