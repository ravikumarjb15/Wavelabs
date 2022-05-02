package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class UIActions extends Base {

	public static String highlightElement = "arguments[0].style.border='2px solid red';";
	public static String removeHighlightElement = "arguments[0].style.border='none';";
	public static String scrollIntoView = "arguments[0].scrollIntoView(true);";
	
	
	public static void clickWebElement(By byObject, String msg) {

		WebElement element;
		try {
			wait.until(ExpectedConditions.elementToBeClickable(byObject));
			element = driver.findElement(byObject);
			jsExecutor.executeScript(scrollIntoView, element);
			jsExecutor.executeScript(highlightElement, element);
			jsExecutor.executeScript(removeHighlightElement, element);
			element.click();
			log.info("Action click for the element "+ msg+" has success");
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Action click for the element "+ msg+" has failed");
			
		}

	}
	
	public static void clickWebElements(By byObject, String msg) {
		List<WebElement> elements; 
		try {
			wait.until(ExpectedConditions.elementToBeClickable(byObject));
			elements = driver.findElements(byObject);
			
			log.info("Action click for the element "+ msg+" has success");
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Action click for the element "+ msg+" has failed");
			
		}

	}

	
	public static void checkElementDisplayed(By byObject, String msg) {

		WebElement element;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(byObject));
			element = driver.findElement(byObject);
			jsExecutor.executeScript(scrollIntoView, element);
			jsExecutor.executeScript(highlightElement, element);
			jsExecutor.executeScript(removeHighlightElement, element);
			element.isDisplayed();
			log.info("Element display for the element "+ msg+" has success");
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Element display for the element "+ msg+" has failed");
			
		}

	}

	public static void clearText(By byObject, String msg) {

		WebElement element;
		try {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(byObject));
			element = driver.findElement(byObject);
			jsExecutor.executeScript(scrollIntoView, element);
			jsExecutor.executeScript(highlightElement, element);
			jsExecutor.executeScript(removeHighlightElement, element);
			element.clear();
			log.info("Action clear text for the element "+ msg+" has success");
			

		} catch (Exception e) {
			e.printStackTrace();
			log.error("Action clear text for the element "+ msg+" has failed");
			
		}

	}

	
	public static void enterText(By byObject,String data, String msg) {

		WebElement element;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(byObject));
			element = driver.findElement(byObject);
			jsExecutor.executeScript(scrollIntoView, element);
			jsExecutor.executeScript(highlightElement, element);
			jsExecutor.executeScript(removeHighlightElement, element);
			element.sendKeys(data);
			log.info("Action enter text for the element "+ msg+" has success");
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Action enter text for the element "+ msg+" has failed");
			
		}

	}

	
	public static void selectDropDown(By byObject,String data, String msg) {

		WebElement element;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(byObject));
			element = driver.findElement(byObject);
			jsExecutor.executeScript(scrollIntoView, element);
			jsExecutor.executeScript(highlightElement, element);
			jsExecutor.executeScript(removeHighlightElement, element);
			
			Select select = new Select(element);
			select.selectByIndex(1);
			log.info("Action enter text for the element "+ msg+" has success");
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Action enter text for the element "+ msg+" has failed");
			
		}

	}



}
