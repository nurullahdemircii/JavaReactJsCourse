package eCommerceUserSign.core.abstracts;

public interface LoggerService {
	
	public void userFirstNameError(String message);
	
	public void userLastNameError(String message);
	
	public void userEmailError(String message);
	
	public void userSameEmailError(String message);
	
	public void userPasswordError(String message);
	
	public void userSignUpError(String message);
	
	public void userSignUpSuccess(String message);
	
	public void userSignInError(String message);
	
	public void userSignInSuccess(String message);
	
	public void userGoogleSignUpError(String message);
	
	public void userGoogleSignUpSuccess(String message);
	
}
