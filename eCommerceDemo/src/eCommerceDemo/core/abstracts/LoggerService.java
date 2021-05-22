package eCommerceDemo.core.abstracts;

public interface LoggerService {
	
	void logUserSuccessAdd(String message);
	
	void logUserSuccessUpdate(String message);
	
	void logUserSuccessDelete(String message);
	
	void logUserFaultAdd(String message);
	
	void logUserFaultUpdate(String message);
	
	void logUserFaultDelete(String message);
	
}
