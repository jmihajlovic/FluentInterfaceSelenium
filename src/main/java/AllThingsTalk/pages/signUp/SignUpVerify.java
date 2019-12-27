package AllThingsTalk.pages.signUp;

import static AllThingsTalk.AllThingsTalk.DriverFactory.getChromeDriver;
import static AllThingsTalk.AllThingsTalk.DriverFactory.getWebDriverWait;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpVerify {
	private WebDriver driver = getChromeDriver();
	private WebDriverWait wait = getWebDriverWait(); 
	
	WebElement allBlankErrorMessage; 
	WebElement allEmployees; 
	WebElement closeErrorMessage; 
	
	public SignUpVerify thatProperErrorMessageIsDisplayed(String errorMessage) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal")));

		allBlankErrorMessage = driver.findElement(By.className("modal")); 	
		closeErrorMessage = driver.findElement(By.className("close")); 
		String textOfErrorMessge = allBlankErrorMessage.getText();
		assertThat(textOfErrorMessge, containsString(errorMessage));
		
		closeErrorMessage.click();
		return this; 
	}
	
	public SignUpVerify thatCanRegisterNewAccount() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("all-employees-text")));
		allEmployees = driver.findElement(By.className("all-employees-text")); 
		String confiramtion = allEmployees.getText(); 
		assertThat(confiramtion, containsString("All Employees"));		
		return this; 
	}
	
	
	
}
