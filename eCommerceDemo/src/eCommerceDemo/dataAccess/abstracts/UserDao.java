package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	
	public List<User> getAll();
	
	public User getById(int userId);
	
	public void add(User user);
	
	public void update(User user);

	public void delete(User user);
}
