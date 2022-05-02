package utilities;

import java.awt.AWTException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import base.Base;
import page_class.CreateAccountPage;
import page_class.HomePage;

public class Util {

	public static String generateRandomEmail() {

		String randomEmail = RandomStringUtils.randomAlphabetic(8) + RandomStringUtils.randomNumeric(4) + "@"
				+ RandomStringUtils.randomAlphabetic(5) + ".com";
		return randomEmail;
	}
	
	public static String getURL() throws InvalidFormatException {

		return ExcelHandling.getConfigData("URL");
	}

	public static void main(String[] args) throws InvalidFormatException, AWTException, InterruptedException{
		Base.loadApplication();
		System.out.println(generateRandomEmail());
		ExcelHandling.writeEmailDataInExcel();
		ExcelHandling.readDataInExcel();
		HomePage.createAccount();
		CreateAccountPage.fillAccCreationForm();
	}
}
