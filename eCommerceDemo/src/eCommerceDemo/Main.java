package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.JLoggerManagerAdapter;
import eCommerceDemo.core.concretes.RegExrManagerAdapter;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new RegExrManagerAdapter(), new JLoggerManagerAdapter());
		User user1 = new User(1, "Nurullah", "Demirci","nurullahdemirci061@gmail.com","123456");
		User user2 = new User(2, "Antony", "Wakame","antonywakame@hotmail.com","123t456");
		User user3 = new User(3, "NorthOfKing", "Sorloth","nurullahdemirci061@gmail.com","13oo456");
		User user4 = new User(4, "Elon", "Mask","elonmask@deneme.com","123456.YT");
		User user5= new User(5, "Engin", "Demiroð","elonmask@deneme.com","12345-6YT");
		
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);
		userService.add(user4);
		userService.add(user5);
	}

}
