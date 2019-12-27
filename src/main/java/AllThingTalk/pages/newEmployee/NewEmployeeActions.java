package AllThingTalk.pages.newEmployee;

import static AllThingsTalk.AllThingsTalk.DriverFactory.getChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewEmployeeActions {
	
	 private WebDriver driver = getChromeDriver();
	 
	 List<WebElement> employeeInput; 
	 List<WebElement> addEmployeeButtons; 
	 List<WebElement> employees; 
	 
	 public NewEmployeeActions sendKeyForEmployeeName(String employeeValue) {
		 employeeInput = driver.findElements(By.className("employee-input")); 
		 employeeInput.get(0).sendKeys(employeeValue);
		 return this; 
	 }
	 
	 
	 public NewEmployeeActions sendKeyForEmployeeEmail(String employeeValue) {
		 employeeInput = driver.findElements(By.className("employee-input")); 
		 employeeInput.get(1).sendKeys(employeeValue);
		 return this; 
	 }
	 
	 
	 public NewEmployeeActions sendKeyForEmployeeBirthday(String employeeValue) {
		 employeeInput = driver.findElements(By.className("employee-input")); 
		 employeeInput.get(2).sendKeys(employeeValue);
		 return this; 
	 }
	 public NewEmployeeActions clickOnAddEmployee() {
		 addEmployeeButtons = driver.findElements(By.className("employee-buttons"));
		 addEmployeeButtons.get(0).click();
		 return this; 
	 }
	 
	 public NewEmployeeActions clickOnGoBack() {
		 addEmployeeButtons = driver.findElements(By.className("employee-buttons"));
		 addEmployeeButtons.get(1).click();
		 return this; 
	 }
	 
	 public NewEmployeeActions clickDeleteEmployee() {
		 addEmployeeButtons = driver.findElements(By.className("employee-buttons"));
		 addEmployeeButtons.get(1).click();
		 return this; 
	 }
	 
	 public NewEmployeeActions clickOnEmployee(int i) {
		 employees = driver.findElements(By.className("employee-picture")); 
		 employees.get(i).click();
		 return this; 
	 }
}
