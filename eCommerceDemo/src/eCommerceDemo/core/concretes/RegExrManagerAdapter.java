package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.RegExrService;
import eCommerceDemo.regExr.RegExrManager;

public class RegExrManagerAdapter implements RegExrService{
	
	RegExrManager regExrManager = new RegExrManager();

	@Override
	public boolean eMailValidator(String email) {
		//regExrManager.eMailValidator(email);
		return regExrManager.eMailValidator(email);
	}

}
