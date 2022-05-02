package page_class;

import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;
import page_object.CartPageObject;

public class CartPage extends Base{

	public static void addToCart() throws InvalidFormatException, InterruptedException{
		driver.findElement(By.xpath("(//*[@class='product-count'])[1]")).click();
		List<WebElement> elements = driver.findElements(CartPageObject.addToCart);
		for(int i=0;i<elements.size();i++){
			WebElement ele = elements.get(i);
			int index = i+1;
			action.moveToElement(driver.findElement(By.xpath("(//*[@class='product-container']//*[@class='product-name'])["+index+"]"))).perform();
			ele.click();
			Thread.sleep(500);
			driver.findElement(CartPageObject.continue_Shopping).click();
			Thread.sleep(1000);
			
			elements = driver.findElements(CartPageObject.addToCart);
		
		}
		
	}
	
	public static void duplicateAmount() throws InvalidFormatException, InterruptedException{
		
		List<WebElement> elements = driver.findElements(By.xpath("//tr[contains(@id,'product')]//input[contains(@name,'quantity')][@type='text']"));
		for(int i=0;i<elements.size();i++){
			WebElement ele = elements.get(i);
			if(Integer.valueOf(ele.getAttribute("value").toString().trim())>1){
				int index = i+1;
				String amount = driver.findElement(By.xpath("(//tr[contains(@id,'product')]//span/span[contains(@class,'price')][1])["+index+"]")).getText().toString().trim();
				System.out.println("Duplicate price are : "+ amount);
				 log.info("Duplicate price are : "+ amount);
			}
			
		
		}
		
	}

	
	public static void delete3and6Item() throws InvalidFormatException, InterruptedException{
		
		driver.findElement(By.xpath("(//tr[contains(@id,'product')]/td[@data-title='Delete'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr[contains(@id,'product')]/td[@data-title='Delete'])[5]")).click();
		
		
		
	}

	
	

}
