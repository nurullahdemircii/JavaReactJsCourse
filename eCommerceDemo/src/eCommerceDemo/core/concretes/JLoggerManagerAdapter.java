package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.LoggerService;
import eCommerceDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	JLoggerManager loggerManager = new JLoggerManager();
	
	@Override
	public void logUserSuccessAdd(String message) {
		loggerManager.logUserSuccessAdd(message);
	}

	@Override
	public void logUserSuccessUpdate(String message) {
		loggerManager.logUserSuccessUpdate(message);
	}

	@Override
	public void logUserSuccessDelete(String message) {
		loggerManager.logUserSuccessDelete(message);
	}

	@Override
	public void logUserFaultAdd(String message) {
		loggerManager.logUserFaultAdd(message);
	}

	@Override
	public void logUserFaultUpdate(String message) {
		loggerManager.logUserFaultUpdate(message);
	}

	@Override
	public void logUserFaultDelete(String message) {
		loggerManager.logUserFaultDelete(message);
	}

	

}
