package eCommerceDemo.jLogger;

public class JLoggerManager {
	
	public void logUserSuccessAdd(String message) {
		System.out.println("Yeni Kullan�c� Ba�ar� ile Olu�turuldu. " + message);
	}
	
	public void logUserSuccessUpdate(String message) {
		System.out.println("Kullan�c� Ba�ar� ile G�ncellendi. " + message);
	}
	
	public void logUserSuccessDelete(String message) {
		System.out.println("Kullan�c� Ba�ar� ile Silindi. " + message);
	}
	
	public void logUserFaultAdd(String message) {
		System.out.println("Yeni Kullan�c� Olu�turulamad�. " + message);
	}
	
	public void logUserFaultUpdate(String message) {
		System.out.println("Kullan�c� G�ncellenirken Hata Olu�tu. " + message);
	}
	
	public void logUserFaultDelete(String message) {
		System.out.println("Kullan�c� Silinirken Hata Olu�tu. " + message);
	}
	
}
