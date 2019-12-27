package AllThingsTalk.pages.signUp;

public class SignUpPageObject {

	private SignUpActions act;
	private SignUpVerify verify;

	public SignUpActions act() {
		return act;
	}

	public SignUpVerify verify() {
		return verify;
	}

	private SignUpPageObject() {

	}

	private SignUpPageObject(SignUpActions act, SignUpVerify verify) {
		this.act = act;
		this.verify = verify;
	}

	public static SignUpPageObject getSignUpPage() {
		return new SignUpPageObject(new SignUpActions(), 
									new SignUpVerify());
	}
}
