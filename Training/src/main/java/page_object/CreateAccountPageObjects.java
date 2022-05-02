package page_object;

import org.openqa.selenium.By;

public class CreateAccountPageObjects {
	
	public static By tittleName = By.xpath("//input[@id='id_gender1']");
	public static By customer_firstname = By.xpath("//input[@id='customer_firstname']");
	public static By customer_lastname = By.xpath("//input[@id='customer_lastname']");
	public static By passwd = By.xpath("//input[@id='passwd']");
	public static By firstname = By.xpath("//input[@id='firstname']");
	public static By lastname = By.xpath("//input[@id='lastname']");
	public static By address1 = By.xpath("//input[@id='address1']");
	public static By city = By.xpath("//input[@id='city']");
	public static By state = By.xpath("//Select[@id='id_state']");
	public static By country = By.xpath("//Select[@id='id_country']");
	public static By postcode = By.xpath("//input[@id='postcode']");
	public static By phone_mobile = By.xpath("//input[@id='phone_mobile']");
	public static By registerAcc_Btn = By.xpath("//button[@id='submitAccount']");
	public static By welcomeMsg = By.xpath("//*[text()='Welcome to your account. Here you can manage all of your personal information and orders.']");
	public static By authFailed = By.xpath("//*[contains(text(),'Authentication failed.')]");
	public static By logout = By.xpath("//*[@title='Log me out']");
}
