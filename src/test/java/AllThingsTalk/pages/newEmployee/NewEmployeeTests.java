package AllThingsTalk.pages.newEmployee;

import org.testng.annotations.Test;

import AllThingTalk.pages.newEmployee.NewEmployeePageObject;
import AllThingsTalk.pages.login.LoginPageObject;

import static AllThingTalk.pages.newEmployee.NewEmployeePageObject.getNewEmployeePageObject;
import static AllThingsTalk.pages.login.LoginPageObject.getLoginPageObject;

public class NewEmployeeTests extends BaseTests{

	NewEmployeePageObject newEmployee = getNewEmployeePageObject();
	LoginPageObject login = getLoginPageObject(); 
	
	@Test(description = "Can create new employee", priority = 1)
	public void createNewEmployee() {	
		
		newEmployee.act().sendKeyForEmployeeName(values.name)
						 .sendKeyForEmployeeEmail(values.email)
						 .sendKeyForEmployeeBirthday(values.birthday)
						 .clickOnAddEmployee();
		
		newEmployee.verify().thatNewEmployeIsAdded();
	login.act().clikcOnButton(1); 
	}
	
	@Test(description = "Can delete employee", priority = 2)
	public void deleteEmployee() {	
		
		newEmployee.act().clickOnGoBack()
						 .clickOnEmployee(1)
						 .clickDeleteEmployee();
		
		newEmployee.verify().thatEmployeIsDeleted(); 
	}
	
	
}
