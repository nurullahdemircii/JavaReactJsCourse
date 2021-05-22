package eCommerceUserSign.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceUserSign.core.abstracts.CheckService;

public class CheckManager implements CheckService{

//	FirstName min 2 karakter olmalýdýr.
	@Override
	public boolean checkFirtName(String firstName) {

		if(firstName.length() < 2)
			return false;
		else
			return true;
	}


//	LastName min 2 karakter olmalýdýr.
	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length() < 2)
			return false;
		else
			return true;
	}

//	Regex ile Email Kontrolü Yapýldý.
	@Override
	public boolean checkEmail(String email) {
		String regex = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches())
			return true;
		else
			return false;
	}

//	Password min 6 karakter olmalýdýr.
	@Override
	public boolean checkPassword(String password) {
		if(password.length() < 6)
			return false;
		else
			return true;
	}

}
