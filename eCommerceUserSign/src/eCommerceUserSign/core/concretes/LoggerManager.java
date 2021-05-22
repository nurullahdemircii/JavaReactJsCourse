package eCommerceUserSign.core.concretes;

import eCommerceUserSign.core.abstracts.LoggerService;

public class LoggerManager implements LoggerService{

	@Override
	public void userFirstNameError(String message) {
		System.out.println("Gecersiz Kullanici Adi! " + message);
	}

	@Override
	public void userLastNameError(String message) {
		System.out.println("Gecersiz Kullanici Soyadi! " + message);
	}

	@Override
	public void userEmailError(String message) {
		System.out.println("Gecersiz Email Adresi! " + message);
	}

	@Override
	public void userSameEmailError(String message) {
		System.out.println("Sistemde Kayitli Email Adresi! " + message);
	}

	@Override
	public void userPasswordError(String message) {
		System.out.println("Gecersiz Sifre! " + message);
	}

	@Override
	public void userSignUpError(String message) {
		System.out.println("Kullanici Kayit Hatali! " + message);
	}

	@Override
	public void userSignUpSuccess(String message) {
		System.out.println("Kullanici Kayit Basarili. Hoþgeldiniz " + message);
	}

	@Override
	public void userSignInError(String message) {
		System.out.println("Kullanici Girisi Hatali! " + message);
	}

	@Override
	public void userSignInSuccess(String message) {
		System.out.println("Kullanici Girisi Basarili. Merhaba " + message);
	}

	@Override
	public void userGoogleSignUpError(String message) {
		System.out.println("Google ile Kayýt Hatali! " + message);
	}

	@Override
	public void userGoogleSignUpSuccess(String message) {
		System.out.println("Google ile Kayit Basarili. Hoþgeldiniz " + message);
	}

}
