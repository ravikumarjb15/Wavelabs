package page_object;

import org.openqa.selenium.By;

public class HomePageObjects {

	public static By createAcc_Email_input = By.xpath("//input[@name='email_create']");
	public static By createAcc_Btn = By.xpath("//button[@id='SubmitCreate']");
	public static By createAcc_Email_label = By.xpath("//label[@for='email_create']");
	public static By email = By.xpath("//*[@id='email']");
	public static By password = By.xpath("//*[@id='passwd']");
	public static By signIn = By.xpath("//*[@id='SubmitLogin']");
	
}
