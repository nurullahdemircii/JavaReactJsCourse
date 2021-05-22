package eCommerceUserSign.business.concretes;

import java.util.Scanner;

import eCommerceUserSign.business.abstracts.UserService;
import eCommerceUserSign.core.abstracts.CheckService;
import eCommerceUserSign.core.abstracts.GoogleRegisterService;
import eCommerceUserSign.core.abstracts.LoggerService;
import eCommerceUserSign.dataAccess.abstracts.UserDao;
import eCommerceUserSign.entities.concretes.User;

public class UserManager implements UserService{

	Scanner scanner = new Scanner(System.in);
	
	private UserDao userDao;
	private GoogleRegisterService googleResisterService;
	private CheckService checkService;
	private LoggerService loggerService;
	
	public UserManager(UserDao userDao, CheckService checkService, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.loggerService = loggerService;
	}

	public UserManager(UserDao userDao, GoogleRegisterService googleResisterService, CheckService checkService,
			LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.googleResisterService = googleResisterService;
		this.checkService = checkService;
		this.loggerService = loggerService;
	}

	@Override
	public void userSignUp(User user) {

		if( checkService.checkFirtName(user.getFirstName()) ) {
			
			if( checkService.checkLastName(user.getLastName()) ){
				
				if( checkService.checkEmail(user.getEmail()) ) {
					
					if( checkService.checkPassword(user.getPassword()) ) {
						
						for( int i = 0;i < userDao.getAll().size(); i++ ) {
							if ( userDao.getAll().get(i).getEmail().equals(user.getEmail()) ) {
								loggerService.userSameEmailError("");
								return;
							}
						}	//	Check Same Email
						
						System.out.println("Doðrulama Linki Gönderilmiþtir.\nLütfen Þifrenizi Tekrar Giriniz : ");
						String correctPassword = scanner.nextLine();
						
						if(user.getPassword().equals(correctPassword)) {
							userDao.add(user);
							loggerService.userSignUpSuccess(user.getFirstName() + " " + user.getLastName());
						} else {
							loggerService.userSignUpError("Sifreler Eslesmiyor! Lütfen Tekrar Deneyiniz.");
						}	//	Correct Password Again
						
					} 
					else {
						loggerService.userPasswordError("");
						return;
					}	//	Check Password
					
				} 
				else {
					loggerService.userEmailError("");
					return;
				}	//	Check Email
				
			}
			else {
				loggerService.userLastNameError("");
				return;
			}	//	Check Last Name
			
		}
		else {
			loggerService.userFirstNameError("");
			return;
		}	//	Check First Name
		
	}

	@Override
	public void userSignUpWithGoogle(User user) {
		
		for( int i = 0;i < userDao.getAll().size(); i++ ) {
			if ( userDao.getAll().get(i).getEmail().equals(user.getEmail()) ) {
				loggerService.userGoogleSignUpError("");
				loggerService.userSameEmailError("");
				return;
			}
		}	//	checkSameEmail
		
		googleResisterService.registerWithGoogle(user.getFirstName() + " " + user.getLastName());
		
		userDao.add(user);
		
		loggerService.userGoogleSignUpSuccess(user.getFirstName() + " " + user.getLastName());
		
		return;
		
	}

	@Override
	public void userSignIn(String email, String password) {
		
		for( int i = 0;i < userDao.getAll().size(); i++ ) {
			if ( userDao.getAll().get(i).getEmail().equals(email) && userDao.getAll().get(i).getPassword().equals(password)) {
				loggerService.userSignInSuccess(userDao.getById(i).getFirstName() + " " + userDao.getById(i).getLastName());
				return;
				
			}
		}
		
		loggerService.userSignInError("");
	}

}
