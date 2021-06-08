package com.nurullahdemirci.northwindSpringBoot.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nurullahdemirci.northwindSpringBoot.business.abstracts.UserService;
import com.nurullahdemirci.northwindSpringBoot.core.dataAccess.UserDao;
import com.nurullahdemirci.northwindSpringBoot.core.entities.User;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.DataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.Result;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.SuccessDataResult;
import com.nurullahdemirci.northwindSpringBoot.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User added.");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.getByEmail(email));
	}

}
