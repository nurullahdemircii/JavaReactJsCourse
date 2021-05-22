package eCommerceUserSign.business.abstracts;

import eCommerceUserSign.entities.concretes.User;

public interface UserService {

	public void userSignUp(User user);
	
	public void userSignUpWithGoogle(User user);
	
	public void userSignIn(String email, String password);
	
}
