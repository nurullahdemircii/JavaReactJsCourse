package eCommerceDemo.jLogger;

public class JLoggerManager {
	
	public void logUserSuccessAdd(String message) {
		System.out.println("Yeni Kullanýcý Baþarý ile Oluþturuldu. " + message);
	}
	
	public void logUserSuccessUpdate(String message) {
		System.out.println("Kullanýcý Baþarý ile Güncellendi. " + message);
	}
	
	public void logUserSuccessDelete(String message) {
		System.out.println("Kullanýcý Baþarý ile Silindi. " + message);
	}
	
	public void logUserFaultAdd(String message) {
		System.out.println("Yeni Kullanýcý Oluþturulamadý. " + message);
	}
	
	public void logUserFaultUpdate(String message) {
		System.out.println("Kullanýcý Güncellenirken Hata Oluþtu. " + message);
	}
	
	public void logUserFaultDelete(String message) {
		System.out.println("Kullanýcý Silinirken Hata Oluþtu. " + message);
	}
	
}
