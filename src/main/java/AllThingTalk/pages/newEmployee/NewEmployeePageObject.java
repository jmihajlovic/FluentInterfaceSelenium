package AllThingTalk.pages.newEmployee;

public class NewEmployeePageObject {
	
	private NewEmployeeActions act; 
	private NewEmployeeVerify verify; 
	
	public NewEmployeeActions act() {
		return act; 
	}
	
	public NewEmployeeVerify verify() {
		return verify; 
	}
	
	private NewEmployeePageObject() {
		
	}
	
	private NewEmployeePageObject(NewEmployeeActions act, NewEmployeeVerify verify) {
		this.act = act; 
		this.verify = verify; 
	}
	
	public static NewEmployeePageObject getNewEmployeePageObject() {
		return new NewEmployeePageObject(new NewEmployeeActions(),
										 new NewEmployeeVerify()); 
	}

}
