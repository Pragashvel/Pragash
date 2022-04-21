package org.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	static Actions actions;
	static Robot robot;
	static Alert al;
	static JavascriptExecutor executer;
	static TakesScreenshot ts;
    static WebDriverWait driverwait;
    static Select select;
	public static void browserconfigCrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	public static void openUrl(String url) {
		driver.get(url);
		}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
		}
	public static WebElement locateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	    }
	public static WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
		}
	public static WebElement locateByClassName(String className) {
		WebElement findElement = driver.findElement(By.className(className));
		return findElement;
		}
	public static WebElement locateByXpath(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;
		}
	public static void inputText(WebElement element,String value) {
		element.sendKeys(value);
		}
	public static void Click(WebElement element) {
		element.click();
		}
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
		}
	public static String getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		return attribute;
		}
	public static void getUrl(String url) {
		driver.get(url);
		}
	public static void getTitle() {
		driver.getTitle();
	    }
	public static void mouseoverAction(WebElement value) {
		actions=new Actions(driver);
        actions.moveToElement(value).perform();
	    }
	public static void dragAndDropAction(WebElement source,WebElement target) {
		actions=new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		}
	public static void rightClickAction(WebElement value) {
		actions=new Actions(driver);
		actions.contextClick(value).perform();
		}
	public static void doubleClickAction(WebElement value) {
		actions=new Actions(driver);
		actions.doubleClick(value).perform();
		}
	public static void keyPress(int arg0) throws AWTException {
		robot =new Robot();
		robot.keyPress(arg0);
		}
	public static void keyRelease(int keycode ) throws AWTException {
		robot =new Robot();
		robot.keyRelease(keycode);
		}
	public static void navigateUrl(String url) {
		driver.navigate().to(url);			
	    }
	public static void backPage() {
		driver.navigate().back();
		}
	public static void forwardPage() {
		driver.navigate().forward();
		}
	public static void refreshPage() {
		driver.navigate().refresh();
		}
	public static void getScreenshot(String pathname) throws IOException {
		ts =(TakesScreenshot)driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File(pathname);
	    FileHandler.copy(s,d);
		}
	public static void simpleAlert() {
		al = driver.switchTo().alert();
		al.accept();
		}
	public static void confirmAlert() {
		al = driver.switchTo().alert();
		al.dismiss();
		}
	public static void promtAlert(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);
		al.accept();
	    }
	public static String getTextAlert() {
		String text = al.getText();
		return text;
		}
	public static void javascriptExecuterInterface(String method,WebElement element) {
		executer=(JavascriptExecutor)driver;
		executer.executeScript(method, element);
		}
	public static void jsSetAttribute(String script,Object args) {
		Object executeScript = executer.executeScript(script, args);
		}
	public static void implicitWait(long Seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
		}
	public static void webDriverWait(long Seconds) {
		driverwait=new WebDriverWait(driver, Duration.ofSeconds(Seconds));
		}
	public static void fluentWait(long Seconds) {
		//Wait<WebDriver>wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(Seconds))
		}
	public static void parentWindow() {
		String windowHandle = driver.getWindowHandle();
		}
	public static void allWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		}
	public static void webTable() {
	    }
	public static void selectByIndex(WebElement element,int index) {
		select=new Select(element);
		select.selectByIndex(index);
		}
	public static void selectByValue(WebElement element,String value) {
		select=new Select(element);
		select.selectByValue(value);
	    }
	public static void selectByVisibleText(WebElement element,String text) {
		select=new Select(element);
		select.selectByVisibleText(text);
	    }
	public static void getOption(WebElement element) {
		select=new Select(element);
		List<WebElement> list = select.getOptions();
	    }
	public static void getFirstSelectedOption(WebElement element) {
		select=new Select(element);
		select.getFirstSelectedOption();
		}
	public static void getAllSelectedOption(WebElement element) {
		select=new Select(element);
		select.getAllSelectedOptions();
	    }
	public static void deselectByIndex(WebElement element,int index) {
		select=new Select(element);
		select.deselectByIndex(index);
		}
	public static void deselectByValue(WebElement element,String value) {
		select=new Select(element);
		select.deselectByValue(value);
	    }
	public static void deselectByVisibleText(WebElement element,String text) {
		select=new Select(element);
		select.deselectByVisibleText(text);
	    }
	public static void deSelectall(WebElement element) {
		select=new Select(element);
		select.deselectAll();
		}
	public static void isMultiple(WebElement element) {
		select=new Select(element);
		boolean b = select.isMultiple();
	    }
	public static void frameById(String id) {
		driver.switchTo().frame(id);
	    }
	public static void frameByName(String name) {
		driver.switchTo().frame(name);
	    }
	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
	    }
	public static void frameByElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
		}
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	    }
	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	    }
	public static void quite() {
		driver.quit();
	    }
	public static void close() {
		driver.close();
	    }
	public static String excelRead(String path,String sheet,int rowIndex,int cellIndex) throws IOException {
		String value=null;
		File file=new File(path);
		FileInputStream stream= new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		  Sheet st = book.getSheet(sheet);
		  Row row = st.getRow(rowIndex);
		  Cell cell = row.getCell(cellIndex);
		  CellType cellType = cell.getCellType();
		  System.out.println("cellType:"+cellType);
		  switch (cellType) {
		case STRING:
			 value = cell.getStringCellValue();
			System.out.println(value);
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
				 value = dateformat.format(dateCellValue);
				System.out.println(value);
				}
			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal big = BigDecimal.valueOf(numericCellValue);
				value = big.toString();
				System.out.println(value);
				}
			break;
           default:
        	   System.out.println("Invalid");
			break;
		   }
		return value;
		}
	

}
