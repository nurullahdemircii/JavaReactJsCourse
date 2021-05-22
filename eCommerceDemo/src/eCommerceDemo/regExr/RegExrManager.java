package eCommerceDemo.regExr;

import java.util.regex.Pattern;

public class RegExrManager {
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	public boolean eMailValidator(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
				Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(email).find() == true)
			return true;
		else
			return false;
	}
}
