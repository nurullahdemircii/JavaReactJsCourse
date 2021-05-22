package eCommerceUserSign.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceUserSign.dataAccess.abstracts.UserDao;
import eCommerceUserSign.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	List<User> userList = new ArrayList<User>();
		
	public InMemoryUserDao() { }

	@Override
	public List<User> getAll() {
		return userList;
	}

	@Override
	public User getById(int id) {
		return userList.get(id);
	}

	@Override
	public void add(User user) {
		userList.add(user);
	}

	@Override
	public void update(User user) {
		User userToUpdate = userList.stream()
				.filter(u -> u.getId() == user.getId())
				.findFirst()
				.orElse(null);

		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setPassword(user.getPassword());
	}

	@Override
	public void delete(User user) {
		User userToDelete = userList.stream()
				.filter(u -> u.getId() == user.getId())
				.findFirst()
				.orElse(null);

		userList.remove(userToDelete);
	}

}
