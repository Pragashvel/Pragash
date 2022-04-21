package org.com;

import java.io.IOException;

public class HotelApp extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
	browserconfigCrome();
	openUrl("http://adactinhotelapp.com/");
	maximizeWindow();
	//implicitWait(30);
	HotelAppPojo1 p1=new HotelAppPojo1();
	inputText(p1.getTxtUser(),excelRead("C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\FrameBase\\Excel\\Details.xlsx","Details",1, 0));
	inputText(p1.getTxtPass(), excelRead("C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\FrameBase\\Excel\\Details.xlsx","Details",1, 2));
	getScreenshot(("C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\FrameWorkPom\\Screenshot\\hotel223.png"));
	Click(p1.getBtnLogin());
	HotelAppPojo2 p2=new HotelAppPojo2();
	selectByIndex(p2.getDroploct(), 1);
	selectByIndex(p2.getDropHotel(), 2);
	selectByIndex(p2.getDropRoom(), 3);
	selectByIndex(p2.getDropRoomNUm(), 2);
	selectByIndex(p2.getDropAdult(), 1);
	selectByIndex(p2.getDropChild(), 3);
	Click(p2.getBtnSearch());
	HotelAppPojo3 p3=new HotelAppPojo3();
	Click(p3.getBtnRadio());
	Click(p3.getBtnContinue());
	HotelAppPojo4 p4 = new HotelAppPojo4();
	inputText(p4.getTxtFirstname(),excelRead("C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\FrameBase\\Excel\\Details.xlsx","Details",3, 1));
	inputText(p4.getTxtLastname(), excelRead("C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\FrameBase\\Excel\\Details.xlsx","Details",4, 1));
	inputText(p4.getTxtAddress(),excelRead("C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\FrameBase\\Excel\\Details.xlsx","Details",5, 0));
	inputText(p4.getTxtCcnum(), excelRead("C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\FrameBase\\Excel\\Details.xlsx","Details",6, 1));
	selectByIndex(p4.getDropcctype(), 1);
	selectByIndex(p4.getDropExmonth(), 6);
	selectByIndex(p4.getDropExyear(), 7);
	inputText(p4.getTxtCvv(),excelRead("C:\\Users\\admin\\Downloads\\Pragash\\ECLIPSE\\eclipse\\FrameBase\\Excel\\Details.xlsx","Details",3, 2));
	Click(p4.getBtnBook());
	Thread.sleep(3000);
	HotelAppPojo5 p5=new HotelAppPojo5();
	Thread.sleep(3000);
	Click(p5.getBtnLogout());
	}
}
