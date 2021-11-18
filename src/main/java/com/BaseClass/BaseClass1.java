package com.BaseClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass1 {
	public static WebDriver driver;
	public static String value;

	public static WebDriver getBrowser(String type) {
		try {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//Driver//chromedriver.exe");
				driver = new ChromeDriver();
			} else if (type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "//Driver//firefoxdriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getURL(String URL) {
		driver.get(URL);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clearTextBox(WebElement element) {
		element.clear();
	}

	public static void action(String type, WebElement element) {
		Actions action = new Actions(driver);
		try {
			if (type.equalsIgnoreCase("moveToElement")) {
				action.moveToElement(element).build().perform();
			} else if (type.equalsIgnoreCase("click")) {
				action.click(element).build().perform();
			} else if (type.equalsIgnoreCase("doubleclick")) {
				action.contextClick(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void quit() {
		driver.quit();
	}

	public static void implicitWait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}

	public static void explicitWait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	public static void takeScreenshot(String file) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\Screenshot\\" + file + ".png");
		FileUtils.copyFile(s, d);
	}

	public static void sreenShot(String filename) throws AWTException, IOException {
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle r1 = new Rectangle(screenSize);
		BufferedImage s1 = robot.createScreenCapture(r1);
		File D1 = new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\Screenshot\\" + filename + ".png");
		ImageIO.write(s1, "png", D1);
	}

	public static void close() {

		driver.close();
	}

	public static void robot(String type) throws AWTException {
		Robot r = new Robot();
		try {
			if (type.equalsIgnoreCase("down")) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			} else if (type.equalsIgnoreCase("up")) {
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
			} else if (type.equalsIgnoreCase("enter")) {
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			} else if (type.equalsIgnoreCase("rightarrow")) {
				r.keyPress(KeyEvent.VK_RIGHT);
				r.keyRelease(KeyEvent.VK_RIGHT);
			} else if (type.equalsIgnoreCase("leftarrow")) {
				r.keyPress(KeyEvent.VK_LEFT);
				r.keyRelease(KeyEvent.VK_LEFT);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropDown(WebElement element, String type,String value) {
		Select s = new Select(element);
		try {
			if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("byvisibletext")) {
				s.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("byindex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			} else if (type.equalsIgnoreCase("deselectbyindex")) {
				int index = Integer.parseInt(value);
				s.deselectByIndex(index);
			} else if (type.equalsIgnoreCase("deselectbyvisibletext")) {
				s.deselectByVisibleText(value);
			} else if (type.equalsIgnoreCase("deselectbyvalue")) {
				s.deselectByValue(value);
			}
			if (type.equalsIgnoreCase("deselectall")) {
				s.deselectAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void to(String URL) {
		driver.navigate().to(URL);
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void backward() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void alert(String type, String keys) {
		try {
			if (type.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			} else if (type.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			} else if (type.equalsIgnoreCase("sendkeys")) {
				driver.switchTo().alert().sendKeys(keys);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frames(String type, String value) {
	}
	public static String testDataExcel(String location,int Sheetindex,int Rowindex,int Cellindex ) throws IOException {
		File f=new File(location);
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(Sheetindex);
		Row row = sheetAt.getRow(Rowindex);
		Cell cell = row.getCell(Cellindex);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		}
		else if(cellType.equals(CellType.NUMERIC)) {
			double cellvalue = cell.getNumericCellValue();
			int intvalue=(int)cellvalue;
			 value = String.valueOf(intvalue);
			
		}
		return value;
	}
}
