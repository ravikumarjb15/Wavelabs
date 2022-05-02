package page_class;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;

public class MobileView extends Base{

	 public static void mobileViewLaunch() {
		 
		 Map<String, String> mobileEmulation = new HashMap<>();

		 mobileEmulation.put("deviceName", "iPhone SE");

		 ChromeOptions chromeOptions = new ChromeOptions();

		 chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver(chromeOptions);
	
	 } 
}
