package eCommerceDemo.dataAccess.concretes;

import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users;
	
	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public User getById(int userId) {
		return null;
	}

	@Override
	public void add(User user) {
	
	}

	@Override
	public void update(User user) {
	
	}

	@Override
	public void delete(User user) {
		
	}

}
