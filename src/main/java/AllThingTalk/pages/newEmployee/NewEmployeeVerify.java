package AllThingTalk.pages.newEmployee;

import static AllThingsTalk.AllThingsTalk.DriverFactory.getChromeDriver;
import static AllThingsTalk.AllThingsTalk.DriverFactory.getWebDriverWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class NewEmployeeVerify {
	
	private WebDriver driver = getChromeDriver();
	private WebDriverWait wait = getWebDriverWait(); 
	
	List<WebElement> allEmployees;
	List<WebElement> employees;
	
	public NewEmployeeVerify thatNewEmployeIsAdded() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("emp-info")));
				
		allEmployees = driver.findElements(By.className("emp-info")); 
		
		System.out.println(allEmployees.size());
		
		for(int i=0; i <= allEmployees.size()-1; i++ ) {
		Assert.assertEquals(true, allEmployees.get(i).isDisplayed());
		}
		return this; 		
	}
	
	public NewEmployeeVerify thatEmployeIsDeleted() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("employee")));
				
		employees = driver.findElements(By.className("employee")); 
		
		System.out.println(allEmployees.size());
		
		for(int i=0; i <= employees.size()-1; i++ ) {
		Assert.assertEquals(true, employees.get(i).isDisplayed());
		}
		return this; 		
	}
	
	
}
