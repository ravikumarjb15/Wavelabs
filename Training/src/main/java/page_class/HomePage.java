package page_class;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import base.Base;
import page_object.CreateAccountPageObjects;
import page_object.HomePageObjects;
import utilities.ExcelHandling;
import utilities.UIActions;
import utilities.Util;

public class HomePage {

	public static void createAccount() throws InvalidFormatException, InterruptedException{
		
		UIActions.clearText(HomePageObjects.createAcc_Email_input,"createAcc_Email_input");
		UIActions.enterText(HomePageObjects.createAcc_Email_input, ExcelHandling.readDataInExcel(1),"createAcc_Email_input");
		UIActions.clickWebElement(HomePageObjects.createAcc_Email_label,"createAcc_Email_label");
		UIActions.clickWebElement(HomePageObjects.createAcc_Btn,"createAcc_Btn");
//		Thread.sleep(8000);
		
	}
	
	public static void signIn() throws InvalidFormatException, InterruptedException{
		
		UIActions.clearText(HomePageObjects.email,"email");
		UIActions.enterText(HomePageObjects.email, ExcelHandling.readDataInExcel(1),"email");
		UIActions.enterText(HomePageObjects.password, "Test1234","password");
		UIActions.clickWebElement(HomePageObjects.signIn,"signIn");
		UIActions.checkElementDisplayed(CreateAccountPageObjects.welcomeMsg, "welcomeMsg");
	}

	public static void signInInvalidData() throws InvalidFormatException, InterruptedException{
		
		UIActions.clearText(HomePageObjects.email,"email");
		UIActions.enterText(HomePageObjects.email, Util.generateRandomEmail(),"email");
		UIActions.enterText(HomePageObjects.password, "Test1234567890","password");
		UIActions.clickWebElement(HomePageObjects.signIn,"signIn");
		UIActions.checkElementDisplayed(CreateAccountPageObjects.authFailed, "authFailed");
	}

}
