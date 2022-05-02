package page_object;

public class TODOPageObjects {
	
	public static String todoTextBox = "//*[@placeholder='What needs to be done?']";
	
	public static String allList = "//*[@class='view']/label";
	
	public static String activeList = "//*[@class='view']/label";
	
	public static String completedList = "//*[@class='view']/label";
	
	public static String checkbox_MarkComp = "(//*[@class='view']/input[@type='checkbox'])[1]";
	
	public static String getTodoListName(String listName){
		return "//*[@class='todo-list']//*[text()='"+listName+"']";
	}
	
	public static String getFiltersXpathforALL_Active_Completed(String listName){
		return "//*[@class='filters']//li/a[text()='"+listName+"']";
	}

}
