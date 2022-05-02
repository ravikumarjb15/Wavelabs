package stepDefinitions;

import java.awt.AWTException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_class.CartPage;
import page_class.CreateAccountPage;
import page_class.HomePage;
import page_class.MobileView;
import page_object.CartPageObject;
import page_object.CreateAccountPageObjects;
import page_object.HomePageObjects;
import utilities.ExcelHandling;
import utilities.UIActions;

public class AssignmentStepDefinition extends Base{

	@Given("Launch Demo application")
	public void launch_application() throws AWTException, InvalidFormatException {
		Base.loadApplication();
		log.info("Demo Application loaded in Browser......");
	}
	
	@Given("Generate random email")
	public void generate_random_email() throws InvalidFormatException {
	   ExcelHandling.writeEmailDataInExcel();
	   log.info("Randon Email has generated and stored in Excel......");
	}
	
	@Given("Create Account")
	public void create_Account( ) throws InvalidFormatException, InterruptedException {
		HomePage.createAccount();
	   log.info("Account Sign in Success......");
	}
	
	@Given("Login to the account {string}")
	public void Login_to_the_account(String user ) throws InvalidFormatException, InterruptedException {
		if(user.equalsIgnoreCase("dummy")){
			HomePage.signInInvalidData();
		}else
		{
			HomePage.signIn();
		}
	   log.info("Entered all details for login  ");
	}
	
	@Given("Validate Home Page")
	public void Validate_Home_Page( ) throws InvalidFormatException, InterruptedException {
		UIActions.checkElementDisplayed(CreateAccountPageObjects.welcomeMsg, "welcomeMsg");
	   log.info("Verified Home Page......");
	}
	
	@Then("Fill user data and Register account")
	public void fill_user_data_and_Register_account() throws InvalidFormatException {
		CreateAccountPage.fillAccCreationForm();
		log.info("Account Details Filled successfully......");
	}

	@When("Navigate to women section")
	public void navigate_to_women_section() {
		UIActions.clickWebElement(CartPageObject.women_Section,"women_Section");
	}
	
	@When("Navigate to dresses section")
	public void navigate_to_dresses_section() {
		UIActions.clickWebElement(CartPageObject.dresses_Section,"dresses_Section");
	}
	
	@When("Navigate to Tshirts section")
	public void navigate_to_Tshirts_section() {
		UIActions.clickWebElement(CartPageObject.t_Shirts_Section,"t_Shirts_Section");
	}

	@When("Adding all the items to cart from the list")
	public void adding_all_the_items_to_cart_from_the_list() throws InvalidFormatException, InterruptedException {
	  CartPage.addToCart();
	}
	
	@When("Login to the account")
	public void loginToAccount() throws InvalidFormatException, InterruptedException {
		HomePage.signIn();
	}
	
	@When("Navigating to cart")
	public void navigate_to_cart() {
		UIActions.clickWebElement(CartPageObject.cart,"cart");
	}
	
	@When("Duplicate amount or product")
	public void Duplicate_amount_or_product() throws InvalidFormatException, InterruptedException {
		CartPage.duplicateAmount();
	}
	
	@When("Delete third and sixth item")
	public void Delete_third_and_sixth_item() throws InvalidFormatException, InterruptedException {
		CartPage.delete3and6Item();
		 log.info("Third and sixth item has been deleted: ");
	}
	
	@When("Launch browser in Mobile view")
	public void mobileView() throws InvalidFormatException, InterruptedException {
		MobileView.mobileViewLaunch();
		 log.info("Application launched in mobile view");
	}
	
	@When("cart total item count")
	public void cartCount() {
		String count =driver.findElement(CartPageObject.cart_count).getText().trim();
		count = count.replace(" Products", "");
		System.out.println("Total item count is : "+ count);
		 log.info("Total item count is : "+ count);
		
	}
	
	

}
