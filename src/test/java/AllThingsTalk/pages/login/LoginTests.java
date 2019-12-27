package AllThingsTalk.pages.login;

import static AllThingsTalk.pages.login.LoginPageObject.getLoginPageObject;

import org.testng.annotations.Test;


public class LoginTests extends BaseTests{
	
	LoginPageObject login = getLoginPageObject(); 

	@Test(description = "Cannot login with invalid password", priority = 1)
	public void cannotLoginWithInvalidPassword() {
		
		login.act().sendKeysInUsernameEmail(data.newEmail)
					.sendKeysInPassword(data.invalidPassword)
					.clickOnSignInButton();  
		
		login.verify().thatProperErrorMessageIsDisplayed("Invalid username/email/password combination"); 
	}
	
	@Test(description = "Can login with username", priority = 2)
	public void canLoginWithUsername() {
		
		login.act().sendKeysInUsernameEmail(data.newUsername)
					.sendKeysInPassword(data.newPassword)
					.clickOnSignInButton(); 
		
		login.verify().thatCanLogin(); 
		login.act().clikcOnButton(1); 
	}
	
	@Test(description = "Can login with email", priority = 2)
	public void canLoginWithEmail() {
		
		login.act().sendKeysInUsernameEmail(data.newEmail)
					.sendKeysInPassword(data.newPassword)
					.clickOnSignInButton(); 
		
		login.verify().thatCanLogin(); 
		login.act().clikcOnButton(1); 
	}
	
	
	
}
