package eCommerceUserSign;

import eCommerceUserSign.business.concretes.UserManager;
import eCommerceUserSign.core.concretes.CheckManager;
import eCommerceUserSign.core.concretes.GoogleRegisterManagerAdapter;
import eCommerceUserSign.core.concretes.LoggerManager;
import eCommerceUserSign.dataAccess.concretes.InMemoryUserDao;
import eCommerceUserSign.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Nurullah", "Demirci", "nurullahdemirci@gmail.com", "123456");
		User user2 = new User(2, "Engin", "Demiroð", "engindemirag@kodlama.io", "123456");
		User user3 = new User(3, "E", "Mask", "e.mask@gmail.com", "123456");
		User user4 = new User(4, "Isaac", "N", "isaac.n@hotmail.com", "123456");
		User user5 = new User(5, "Ýbn-i", "Sina", "ibn-isina@gmail.com", "12345");
		
		UserManager userManager = new UserManager(new InMemoryUserDao(), new CheckManager(), new LoggerManager());
		
		UserManager userManagerGoogle = new UserManager(new InMemoryUserDao(), new GoogleRegisterManagerAdapter(), new CheckManager(), new LoggerManager());
	
		userManager.userSignUp(user1);
		System.out.println("-----------------------------------------");
		
		userManager.userSignUp(user2);
		System.out.println("-----------------------------------------");
		
		userManager.userSignUp(user3);
		System.out.println("-----------------------------------------");
		
		userManager.userSignUp(user4);
		System.out.println("-----------------------------------------");
		
		userManager.userSignUp(user5);
		System.out.println("-----------------------------------------");
		
		userManager.userSignUp(user1);
		System.out.println("-----------------------------------------");
		
		userManagerGoogle.userSignUpWithGoogle(user1);
		System.out.println("-----------------------------------------");
		
		userManagerGoogle.userSignUpWithGoogle(user2);
		System.out.println("-----------------------------------------");
		
		userManagerGoogle.userSignUpWithGoogle(user1);
		System.out.println("-----------------------------------------");
		
		userManager.userSignIn("nurullahdemirci@gmail.com", "123456");
		System.out.println("-----------------------------------------");
		
		userManager.userSignIn("n.demirci@gmail.com", "123456");
		System.out.println("-----------------------------------------");
		
	}

}
