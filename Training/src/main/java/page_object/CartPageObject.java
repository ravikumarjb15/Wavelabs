package page_object;

import org.openqa.selenium.By;

public class CartPageObject {

	public static By women_Section = By.xpath("//a[@title='Women']");
	public static By dresses_Section = By.xpath("(//a[@title='Dresses'])[2]");
	public static By t_Shirts_Section = By.xpath("(//a[@title='T-shirts'])[2]");
	public static By continue_Shopping = By.xpath("//*[@title='Continue shopping']");
	public static By addToCart = By.xpath("//*[@title='Add to cart']");
	public static By cart = By.xpath("//a[@title='View my shopping cart']");
	public static By cart_count = By.xpath("//*[@id='summary_products_quantity']");
	
}
