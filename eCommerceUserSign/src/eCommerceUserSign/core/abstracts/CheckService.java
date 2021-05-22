package eCommerceUserSign.core.abstracts;

public interface CheckService{
	
	public boolean checkFirtName(String firstName);
	
	public boolean checkLastName(String lastName);
	
	public boolean checkEmail(String email);
	
	public boolean checkPassword(String password);
	
}
