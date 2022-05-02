package page_class;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import page_object.CreateAccountPageObjects;
import utilities.ExcelHandling;
import utilities.UIActions;

public class CreateAccountPage {

	public static void fillAccCreationForm() throws InvalidFormatException {

		UIActions.clickWebElement(CreateAccountPageObjects.tittleName, "tittleName");
		UIActions.enterText(CreateAccountPageObjects.customer_firstname, ExcelHandling.getConfigData("customer_firstname"),"customer_firstname");
		UIActions.enterText(CreateAccountPageObjects.customer_lastname, ExcelHandling.getConfigData("customer_lastname"),"customer_lastname");
		UIActions.enterText(CreateAccountPageObjects.passwd, ExcelHandling.getConfigData("passwd"),"passwd");
		UIActions.enterText(CreateAccountPageObjects.firstname, ExcelHandling.getConfigData("firstname"),"firstname");
		UIActions.enterText(CreateAccountPageObjects.lastname, ExcelHandling.getConfigData("lastname"),"lastname");
		UIActions.enterText(CreateAccountPageObjects.address1, ExcelHandling.getConfigData("address1"),"address1");
		UIActions.enterText(CreateAccountPageObjects.city, ExcelHandling.getConfigData("city"),"city");
		UIActions.selectDropDown(CreateAccountPageObjects.state, ExcelHandling.getConfigData("state"),"state");
		UIActions.enterText(CreateAccountPageObjects.postcode, ExcelHandling.getConfigData("postcode"),"postcode");
		UIActions.selectDropDown(CreateAccountPageObjects.country, ExcelHandling.getConfigData("country"),"country");
		UIActions.enterText(CreateAccountPageObjects.phone_mobile, ExcelHandling.getConfigData("phone_mobile"),"phone_mobile");
		UIActions.clickWebElement(CreateAccountPageObjects.registerAcc_Btn, "registerAcc_Btn");
		UIActions.checkElementDisplayed(CreateAccountPageObjects.welcomeMsg, "welcomeMsg");
		UIActions.clickWebElement(CreateAccountPageObjects.logout, "logout");
		
	}
}
