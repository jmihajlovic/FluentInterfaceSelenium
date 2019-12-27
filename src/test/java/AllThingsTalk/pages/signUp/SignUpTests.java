package AllThingsTalk.pages.signUp;

import org.testng.annotations.Test;

import AllThingsTalk.pages.login.LoginPageObject;
import AllThingsTalk.pages.signUp.SignUpPageObject;

import static AllThingsTalk.pages.login.LoginPageObject.getLoginPageObject;
import static AllThingsTalk.pages.signUp.SignUpPageObject.getSignUpPage;


public class SignUpTests extends BaseTests{

	SignUpPageObject signUp = getSignUpPage(); 
	LoginPageObject login = getLoginPageObject(); 	
	
	@Test(description = "Verify that all fields are mandatory.", priority = 1)
	public void allFieldsAreBlank() {
		signUp.act().clickOnSignUp(); 
		
		signUp.verify()
					.thatProperErrorMessageIsDisplayed("The name field cannot be left blank!"); 
	}
			
	@Test(description = "Cannot register with the same email.", priority = 2)
	public void canntoRegisterWithSameEmail() {
		signUp.act().sendKeysToEmail(data.sameEmail)
					.sendKeysToUsername(data.newUsername)
					.sendKeysToPassword(data.newPassword)
					.clickOnSignUp();
		
		signUp.verify().
				thatProperErrorMessageIsDisplayed("That e-mail already exists");
	}
	
	@Test(description = "Cannot register with the same username.", priority = 3)
	public void canntoRegisterWithSameUsername() {
		signUp.act().sendKeysToEmail(data.newEmail)
					.sendKeysToUsername(data.sameUsername)
					.sendKeysToPassword(data.newPassword)
					.clickOnSignUp();
		
		signUp.verify().
				thatProperErrorMessageIsDisplayed("That username already exists"); 		
	}
	
	@Test(description = "Cannot register without email.", priority = 4)
	public void canntoRegisterWithoutEmail() {
		signUp.act().sendKeysToEmail(data.emailBlank)
					.sendKeysToUsername(data.newUsername)
					.sendKeysToPassword(data.newPassword)
					.clickOnSignUp();
		
		signUp.verify().
				thatProperErrorMessageIsDisplayed("The email field cannot be left blank!"); 		
	}
	
	@Test(description = "Cannot register without password.", priority = 5)
	public void canntoRegisterWithoutPassword() {
		signUp.act().sendKeysToEmail(data.newEmail)
					.sendKeysToUsername(data.newUsername)
					.sendKeysToPassword(data.passwordBlanck)
					.clickOnSignUp();
		
		signUp.verify().
				thatProperErrorMessageIsDisplayed("The password field cannot be left blank!"); 		
	}
	
	@Test(description = "Can register new account.", priority = 6)
	public void registerNewAccount() {
		signUp.act().sendKeysToEmail(data.newEmail)
					.sendKeysToUsername(data.newUsername)
					.sendKeysToPassword(data.newPassword)
					.clickOnSignUp();
		signUp.verify().thatCanRegisterNewAccount(); 
		login.act().clikcOnButton(1); 
	}
}
