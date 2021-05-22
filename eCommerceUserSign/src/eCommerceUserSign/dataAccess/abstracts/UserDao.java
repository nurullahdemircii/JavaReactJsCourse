package eCommerceUserSign.dataAccess.abstracts;

import java.util.List;

import eCommerceUserSign.entities.concretes.User;

public interface UserDao {
	
	List<User> getAll();
	
	User getById(int id);
	
	void add(User user);
	
	void update(User user);
	
	void delete(User user);
	
}
