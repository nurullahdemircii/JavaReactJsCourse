package eCommerceDemo.business.concretes;

import java.util.List;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.LoggerService;
import eCommerceDemo.core.abstracts.RegExrService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private RegExrService regExrService;
	private LoggerService loggerService;
	
	public UserManager(UserDao userDao, RegExrService regExrService, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.regExrService = regExrService;
		this.loggerService = loggerService;
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public User getById(int userId) {
		return userDao.getById(userId);
	}

	@Override
	public void add(User user) {
		int control = 1;
		if(regExrService.eMailValidator(user.geteMail()) == true) {
			if(user.getPassword().length() >= 6 ) {
				if(userDao.getAll() == null)
					control = 1;
				else
					for(User users : userDao.getAll()) {
						if(users.geteMail() == user.geteMail()) {
							control = 0;
						}
					}
			}
			else {
				control = 0;
				loggerService.logUserFaultAdd("Þifre Bilginizi Kontrol Ediniz!");
			}
		}
		else {
			control = 0;
			loggerService.logUserFaultAdd("Lütfen Geçerli Bir E-Mail Adresi Yazýnýz!");
		}
		if(control == 1) {
			userDao.add(user);
			loggerService.logUserSuccessAdd(user.getFirstName() + " " + user.getLastName());
		}
	}

	@Override
	public void update(User user) {
		int control = 0;
		if(regExrService.eMailValidator(user.geteMail()) == true) {
			if(user.getPassword().length() >= 6 ) {
				for(User users : userDao.getAll()) {
					if(users.geteMail() != user.geteMail()) {
						control = 1;
					}
				}
			}
			else {
				loggerService.logUserFaultUpdate("Yeni Þifre Bilginizi Kontrol Ediniz!");
			}
		}
		else {
			loggerService.logUserFaultUpdate("Lütfen Geçerli Bir Yeni E-Mail Adresi Yazýnýz!");
		}
		if(control == 1) {
			userDao.add(user);
			loggerService.logUserSuccessUpdate(user.getFirstName() + " " + user.getLastName());
		}
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

}
