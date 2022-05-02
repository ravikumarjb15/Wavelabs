package page_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import base.Base;
import page_object.TODOPageObjects;

public class TODOPage extends Base {
	
	public static String markedListValue = "";

	public static void createTodo(String todoName) {
		driver.findElement(By.xpath(TODOPageObjects.todoTextBox)).sendKeys(todoName);
		driver.findElement(By.xpath(TODOPageObjects.todoTextBox)).sendKeys(Keys.ENTER);
		log.info("To do has created with name : " + todoName);
	}

	public static void validateToDOList(String todoListName) {
		boolean status = driver.findElement(By.xpath(TODOPageObjects.getTodoListName(todoListName))).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	public static void viewAllTODOList( ) {
		boolean status = driver.findElement(By.xpath(TODOPageObjects.allList)).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	public static void viewActiveTODOList() {
		boolean status = driver.findElement(By.xpath(TODOPageObjects.activeList)).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	public static void viewCompletedTODOList() {
		boolean status = driver.findElement(By.xpath(TODOPageObjects.completedList)).isDisplayed();
		Assert.assertEquals(status, true);
	}

	public static void viewSpecificList(String option) {
		switch (option) {
		case "All":
			driver.findElement(By.xpath(TODOPageObjects.getFiltersXpathforALL_Active_Completed(option))).click();
			break;
		case "Active":
			driver.findElement(By.xpath(TODOPageObjects.getFiltersXpathforALL_Active_Completed(option))).click();
			break;
		case "Completed":
			driver.findElement(By.xpath(TODOPageObjects.getFiltersXpathforALL_Active_Completed(option))).click();
			break;
		default:
			log.info("No option matched to view list");
		}

	}
	
	public static void markCompleted() {
		markedListValue = driver.findElement(By.xpath("(//*[@class='view']/label)[1]")).getText().toString();
		driver.findElement(By.xpath(TODOPageObjects.checkbox_MarkComp)).click();
	}
	
	public static void viewCompletedList() {
		viewCompletedTODOList();
		boolean status = driver.findElement(By.xpath("//*[@class='view']/label[text()='"+markedListValue+"']")).isDisplayed();
		Assert.assertEquals(status, true);
		log.info("Verified todo in completed list, which was marked in previous steps  and the value is : "+markedListValue);
	}
	

}
