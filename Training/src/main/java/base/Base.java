package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Util;

public class Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;

	public static Actions action;
	public static Robot robo;
	public static WebDriverWait wait;
	public static JavascriptExecutor jsExecutor; 

	public static void loadApplication() throws AWTException, InvalidFormatException {

		robo = new Robot();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		}

		driver.get(Util.getURL());

		action = new Actions(driver);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		jsExecutor = (JavascriptExecutor) driver;  

	}

}
