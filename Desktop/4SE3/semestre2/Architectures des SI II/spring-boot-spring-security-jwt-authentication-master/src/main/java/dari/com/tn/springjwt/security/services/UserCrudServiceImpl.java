package dari.com.tn.springjwt.security.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dari.com.tn.springjwt.models.User;
import dari.com.tn.springjwt.repository.UserCrud;

import org.apache.logging.log4j.Logger;



@Service
public class UserCrudServiceImpl implements UserCrudService {

	private static final Logger L =LogManager.getLogger(UserCrudServiceImpl .class);
	
	@Autowired
	UserCrud userRepository2;
	
	@Override
	public List<User> retrieveAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = (List<User>) userRepository2.findAll();
		for (User user : users) {
			L.info("user :" + user);
		}
		return users ;
	}

	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return userRepository2.save(u);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository2.deleteById(id);
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		return userRepository2.save(u);
	}

	@Override
	public User retrieveUser(String id) {
		// TODO Auto-generated method stub
		return (User) userRepository2.findAll();
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		this.userRepository2.deleteById(id);
	}
	public int getNombreUSERJPQL() {
		return  userRepository2.count1();
	}
	public int getNombreADMINJPQL() {
		return  userRepository2.count2();
	}

}
