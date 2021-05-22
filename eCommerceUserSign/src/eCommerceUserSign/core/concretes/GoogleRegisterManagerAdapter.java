package eCommerceUserSign.core.concretes;

import eCommerceUserSign.authGoogle.GoogleRegisterManager;
import eCommerceUserSign.core.abstracts.GoogleRegisterService;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService{

	private GoogleRegisterManager googleRegistermanager = new GoogleRegisterManager();
	
	@Override
	public void registerWithGoogle(String userName) {
		googleRegistermanager.register(userName);
	}

}
