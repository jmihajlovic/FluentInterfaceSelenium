package AllThingsTalk.pages.login;

public class LoginPageObject {
	
	private LoginActions act; 
	private LoginVerify verify; 
	
	public LoginActions act() {
		return act; 
	}
	
	public LoginVerify verify() {
		return verify; 
	}
	
	private LoginPageObject() {
		
	}
	
	private LoginPageObject(LoginActions act, LoginVerify verify) {
		this.act = act; 
		this.verify = verify; 
	}
	
	public static LoginPageObject getLoginPageObject() {
		return new LoginPageObject(new LoginActions(),
								   new LoginVerify()); 
	}
}
